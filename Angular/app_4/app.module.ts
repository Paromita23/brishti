import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { UserService } from './user.service';
import { UserComponent } from './user/user.component';
import { EmployeeComponent } from './employee/employee.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { RouterModule, Routes} from '../../node_modules/@angular/router';
import { EmployShowComponent } from './empshow/empshow.component';
import { EmpShowComponent } from './emp-show/emp-show.component';



const appRoutes : Routes = [
    { path: 'Dashboard', component: DashboardComponent},
    { path:'',component: EmployeeComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    EmployeeComponent,
    DashboardComponent,
    LoginComponent,
    EmployShowComponent,
    EmpShowComponent
  ],
  imports: [
    BrowserModule,HttpModule,FormsModule,RouterModule.forRoot(appRoutes)
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
