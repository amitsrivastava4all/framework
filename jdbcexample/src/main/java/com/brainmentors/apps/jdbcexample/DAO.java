package com.brainmentors.apps.jdbcexample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
		return namedJdbcTemplate;
	}

	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int add(Employee emp) {
		return jdbcTemplate.update("insert into emp (id, name, salary) values(?,?,?)",emp.getId(), emp.getName(), emp.getSalary());
	}
	public int remove(Employee emp) {
		return jdbcTemplate.update("delete from emp where id=?",emp.getId());
	}
	
	public boolean tableCreate() {
		jdbcTemplate.execute("create table if not exists dept(id integer, name varchar(20))");
		return true;
	}
	public List<Employee> getRecords(double salary){
		
		 return jdbcTemplate.query("select id ,name, salary from emp where salary>?",new EmpRowMapper(),salary);
	}
	public List<Employee> getNamedParamRecords(String ename, double esalary){
		
		Map<String , Object > parameterMap = new HashMap<>();
		parameterMap.put("name",ename);
		parameterMap.put("salary",esalary);
		return namedJdbcTemplate.query("select id ,name, salary from emp where salary>:salary and name=:name",parameterMap,new EmpRowMapper());
	}
	
}

class EmpRowMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}
}

