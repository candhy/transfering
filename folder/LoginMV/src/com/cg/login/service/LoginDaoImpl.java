package com.cg.login.service;

import java.sql.Connection;

import com.cg.login.bean.LoginBean;
import com.cg.login.connection.Dbconnection;
import com.cg.login.dao.ILoginDao;
import com.cg.login.exception.LoginException;

public class LoginDaoImpl implements ILoginDao {

	@Override
	public boolean verifyLogin(LoginBean loginBean) throws LoginException {
		boolean result=false;
		Connection connection=Dbconnection.getConnection();
		// TODO Auto-generated method stub
		return result;
	}

}
