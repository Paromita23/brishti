import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router} from '@angular/router';
import { PARAMETERS } from '../../../node_modules/@angular/core/src/util/decorators';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {
  name :string;
  constructor(private route :ActivatedRoute, private router:Router) {
    this.name = this.route.snapshot.params["name"];
  }
 ngOnInit() {
  }

}
