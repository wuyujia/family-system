package org.rent.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebServlet;

/** Created by wuyujia on 17/3/31. */
@WebServlet(urlPatterns = "/druid/*")
public class DruidStatViewServlet extends StatViewServlet{

}
