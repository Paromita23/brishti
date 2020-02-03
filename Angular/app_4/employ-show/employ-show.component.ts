import { Component, OnInit } from '@angular/core';
import { EmployeesService } from '../employees.service';
import { Employees } from '../employees';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employ-show',
  templateUrl: './employ-show.component.html',
  styleUrls: ['./employ-show.component.css']
})
export class EmployShowComponent implements OnInit {

  employees: Observable<Employees>;
  empId : number;
  constructor(private employeesService: EmployeesService) {
    this.empId=parseInt(localStorage.getItem("empId"));
    this.employees = employeesService.showEmploy(this.empId);
  }
  ngOnInit() {
  }

}