package com.cos.blog.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.blog.model.person;

import lombok.Getter;

@Getter
public class PrincipalDetail implements UserDetails {
	private person person;
	
	public PrincipalDetail(person person) {
		this.person=person;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collectors=new ArrayList<>();
		collectors.add(()->{return "ROLE_"+person.getRoles();});
		return collectors;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return person.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return person.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
