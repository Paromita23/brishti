import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '../../../node_modules/@angular/router';

@Component({
  selector: 'app-third',
  templateUrl: './third.component.html',
  styleUrls: ['./third.component.css']
})
export class ThirdComponent implements OnInit {
  name:string;

  constructor(private route :ActivatedRoute) {
    this.name=this.route.snapshot.params["name"];
   }

  ngOnInit() {
  }

}
