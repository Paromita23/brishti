import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router' ;
@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
  name : string;
  age : number;

  constructor(private router : Router) {
    this.name='Ramana';
    this.age=21;
  }
third() {
  this.router.navigate(['/Third',this.name,this.age]);
}
 
  ngOnInit() {
  }

}
