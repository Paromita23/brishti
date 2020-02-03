import { Component, OnInit } from '@angular/core';
import  {NgForm } from '@angular/forms';
import { User } from 'src/app/user';
@Component({
  selector: 'app-template',
  templateUrl: './template.component.html',
  styleUrls: ['./template.component.css']
})
export class TemplateComponent implements OnInit {
 isValidFormSubmitted=false;
 user =new User();

 onFormSubmit(form:NgForm) {
   this.isValidFormSubmitted=false;
   if(form.invalid){
     return;
   }
   this.isValidFormSubmitted=true;
 }
  constructor() { }

  ngOnInit() {
  }

}
