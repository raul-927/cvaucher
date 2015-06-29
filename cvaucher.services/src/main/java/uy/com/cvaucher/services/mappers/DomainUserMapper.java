package uy.com.cvaucher.services.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import uy.com.cvaucher.services.domain.DomainUser;

public interface DomainUserMapper 
{
	
	@Select("SELECT dom_usr_id, dom_usr_nom, dom_usr_ap, dom_usr_nic, dom_usr_pass, dom_usr_enabled FROM domain_user")
	@ResultMap("uy.com.cvaucher.services.mappers.DomainUserMapper.DomainUserResult")
	List<DomainUser> findAllDomainUsers();
	
	
	@Select("SELECT * FROM domain_user WHERE dom_usr_id = #{domUsrId}")
	@ResultMap("uy.com.cvaucher.services.mappers.DomainUserMapper.DomainUserResult")
	DomainUser findDomainUserById(int domUsrId);
	
	
	@Insert("INSERT INTO domain_user " +
			"(dom_usr_nom, dom_usr_ap, dom_usr_nic, dom_usr_pass, dom_usr_enabled) " +
			"VALUES " +
			"(#{domUsrNom}, #{domUsrAp}, #{domUsrNic}, #{domUsrPass}, #{domUsrEnabled})")
	void insertDomainUser(DomainUser domainUser);
	
	
	@Update("UPDATE domain_user SET " +
			"dom_user_nom = #{domUsrNom}, dom_usr_ap = #{domUsrAp}, dom_usr_nic = #{domUsrNic} " +
			"WHERE dom_usr_id = #{domainUser.domUsrId}")
	void updateDomainUser(DomainUser domainUser);
	
	
	@Delete("DELETE FROM domain_user WHERE dom_usr_id = #{domUsrId}")
	void deleteDomainUser(int domUsrId);
}
