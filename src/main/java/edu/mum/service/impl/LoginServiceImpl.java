package edu.mum.service.impl;

import org.springframework.stereotype.Service;

import edu.mum.domain.Login;
import edu.mum.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService
{
		public String verify(Login login)
		{
				String userName = login.getUserName();
				String password = login.getPassword();
				if (userName==null || password == null)
				{
					return "false";
				}
				//return userName.equals("admin") && password.equals("admin");
				if(userName.equals("admin") && password.equals("admin"))
				{
						return "true";
				}
				else
				{
						return "false";
				}
		}
		
}
