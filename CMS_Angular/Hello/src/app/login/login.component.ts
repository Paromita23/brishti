import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _router : Router) {}
  userName : string;
  passWord : string;
  validateMe() {
    localStorage.setItem("trainee", "Paromita");
    if(this.userName=="hexaware" && this.passWord=="hexaware") {
      //alert("correct");
      this._router.navigate(['/menu']);
    } else {
      alert("invalid");
    }
  }

  ngOnInit() {
  }

}
