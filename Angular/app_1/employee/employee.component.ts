import { Component, OnInit } from '@angular/core';
import {Employee} from '../employee';
import {Router} from '@angular/router';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
name :string;
  constructor(private _router:Router) {
    alert(this.model.sayHello());
    alert(this.model.logout());
   }
model = new DemoService();
show(name){
  this.name=name;
  localStorage.setItem("name",name);
  this._router.navigate(["/Login"]);

}

  employs = [new Employee(1,"naren","angular","manager",88233),
  new Employee(2,"naren1","react","developer",88233),
  new Employee(3,"naren2","node","teamlead",88233),
  new Employee(4,"naren23","ui","programmer",88233),
  new Employee(5,"naren3","java","expert",88233)];
  

  ngOnInit() {
  }

}
