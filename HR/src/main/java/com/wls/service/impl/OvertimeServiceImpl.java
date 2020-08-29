package com.wls.service.impl;

import java.util.List;

import com.wls.service.OvertimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.wls.entity.Department;
import com.wls.entity.Employee;
import com.wls.entity.Overtime;
import com.wls.mapper.DepartmentMapper;
import com.wls.mapper.EmployeeMapper;
import com.wls.mapper.OvertimeMapper;

@Service
public class OvertimeServiceImpl extends ServiceImpl<OvertimeMapper, Overtime>
	implements OvertimeService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	
	/**
	 * 为overtime对象setDepartment setPosition
	 * @param overtime
	 * @return
	 */
	public Overtime setObject(Overtime overtime){
		Integer departmentNumber = overtime.getDepartmentNumber();
		Department  department = departmentMapper.selectByNumber(departmentNumber);
		overtime.setDepartment(department);
		
		Integer employeeNumber = overtime.getEmployeeNumber();
		Employee employee = employeeMapper.selectByNumber(employeeNumber);
		overtime.setEmployee(employee);
		return overtime;
	}

	@Override
	public Page<Overtime> selectListByPage(int pageNo) {
		Page<Overtime> page = new Page<Overtime>(pageNo,4,"id");
		//是否为升序 ASC（ 默认： true ）
		page.setAsc(false);
		List<Overtime> oList = baseMapper.selectPage(page, null);
		for(Overtime overtime : oList){
			setObject(overtime);
		}
		page.setRecords(oList);
		return page;
	}

	@Override
	public Page<Overtime> selectByEmployee(int pageNo, Integer employeeNumber) {
		Page<Overtime> page = new Page<Overtime>(pageNo, 4, "id");
		//是否为升序 ASC（ 默认： true ）
		page.setAsc(false);
		 //查询一个员工的考勤记录，根据id倒序排序
		List<Overtime> oList = baseMapper.selectPage(page, new EntityWrapper<Overtime>()
				.eq("employee_number", employeeNumber)
				.orderBy("id", false));
		for(Overtime overtime : oList){
			//为attendance对象setEmployee
			setObject(overtime);
		}
		page.setRecords(oList);
		return page;
	}

}
