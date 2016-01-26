package uy.com.cvaucher.security;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.springframework.remoting.httpinvoker.CommonsHttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerClientConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.apache.commons.httpclient.methods.PostMethod;

public class BasicAuthenticationCommonsHttpInvokerRequestExecutor extends
CommonsHttpInvokerRequestExecutor {

@Override
protected PostMethod createPostMethod(HttpInvokerClientConfiguration config) throws IOException {
  PostMethod postMethod = super.createPostMethod(config);

  Authentication auth =
      SecurityContextHolder.getContext().getAuthentication();
 
  if ((auth != null) && (auth.getName() != null) &&
        (auth.getCredentials() != null)) {
    String base64 = auth.getName() + ":" + auth.getCredentials().toString();
    postMethod.setRequestHeader("Authorization", "Basic " +
        new String(Base64.encodeBase64(base64.getBytes())));
  }
  System.out.println("auth = "+auth.getName() + " "+auth.getCredentials());
  System.out.println("postMethod = "+postMethod.getName());
  return postMethod;
}
}
