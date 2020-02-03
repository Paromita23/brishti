import { Component, OnInit } from '@angular/core';
import { Router } from '../../../node_modules/@angular/router';


@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
 name :string;
 constructor(private router :Router) {
   this.name ='value';
 }
third() {
  this.router.navigate(['/Third',this.name]);
}
  ngOnInit() {
  }

}
