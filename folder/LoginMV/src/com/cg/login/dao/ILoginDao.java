package com.cg.login.dao;

import com.cg.login.bean.LoginBean;
import com.cg.login.exception.LoginException;

public interface ILoginDao {

	boolean verifyLogin(LoginBean loginBean) throws LoginException;

}
