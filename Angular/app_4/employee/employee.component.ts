import { Component, OnInit } from '@angular/core';
import { EmployeesService } from '../employees.service';
import { Employees } from '../employees';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
  employees: Observable<Employees[]>;
  constructor(private employeesService: EmployeesService, private router : Router) {
    this.employees = employeesService.getEmployees();
  }
  empId : number;
  dashboard(empId) {
    this.empId = empId;
   // alert(this.empId);
    localStorage.setItem("empId", empId);
    this.router.navigate(["/Dashboard"]);
  }

  ngOnInit() {
  }

}
