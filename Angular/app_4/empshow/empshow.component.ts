import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-empshow',
  templateUrl: './empshow.component.html',
  styleUrls: ['./empshow.component.css']
})
export class EmployShowComponent implements OnInit {

  employees: Observable<Employee>;
  empId :number;
  constructor(private employeeService: EmployeeService) {
    this.empId=parseInt(localStorage.getItem("empId"));
    this.employees = employeeService.showEmploy(this.empId);
  }
  ngOnInit() {
  }

}