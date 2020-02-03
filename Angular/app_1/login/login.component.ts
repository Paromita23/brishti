import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { Employee } from '../employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
model = new Login();
constructor(private router: Router) {
  this.model.userName = localStorage.getItem("name");
}
login()
{
  
  if(this.model.password == "hexaware") {
    this.router.navigate(["/Dashboard"]);
  }
  else{
    alert("not open");
  }
  
}

  ngOnInit() {
  }

}
