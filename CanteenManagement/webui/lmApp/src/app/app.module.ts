import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {RouterModule, Routes} from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CustomerOrderHistoryComponent } from './customerorderhistory/customerorderhistory.component';
import { CustomerPendingHistoryComponent } from './customer-pending-history/customer-pending-history.component';
import { VendorloginComponent } from './vendorlogin/vendorlogin.component';
import { VendorComponent } from './vendor/vendor.component';
import { VendordashboardComponent } from './vendordashboard/vendordashboard.component';
import { VendorOrderHistoryComponent } from './vendor-order-history/vendor-order-history.component';
import { VendorPendingHistoryComponent } from './vendor-pending-history/vendor-pending-history.component';
import { PlaceorderComponent } from './placeorder/placeorder.component';
import { WalletComponent } from './wallet/wallet.component';
import { MenuComponent } from './menu/menu.component';
import { AcceptrejectComponent } from './acceptreject/acceptreject.component';
import { CmsmainComponent } from './cmsmain/cmsmain.component';
import { CancelorderComponent } from './cancelorder/cancelorder.component';
import { LogoutComponent } from './logout/logout.component';
import { CustomercancelorderComponent } from './customercancelorder/customercancelorder.component';
import { CustomFilterPipe } from './custom-filterng.pipe';
import { QrCodeComponent } from './qr-code/qr-code.component';
import { QRCodeModule } from 'angularx-qrcode';
import { FreegiftComponent } from './freegift/freegift.component';


const appRoutes : Routes = [
  {path : 'dashBoard', component : DashboardComponent,
   children : [
    {path : 'OrderHistory', component : CustomerOrderHistoryComponent, outlet : 'data' },
    {path : 'Pending Orders', component : CustomerPendingHistoryComponent, outlet : 'data' },
    {path : 'wallet Info', component : WalletComponent, outlet : 'data' },
    {path : 'placeorder', component : PlaceorderComponent, outlet : 'data' },
    {path : 'cancelorder', component : CancelorderComponent, outlet : 'data' },
    {path : 'qrComponent', component : QrCodeComponent, outlet : 'data' },
    {path : 'Freegift', component : FreegiftComponent, outlet : 'data' },
    ]
  },
  {path : 'vendordashboard', component : VendordashboardComponent,
  children : [
   {path : 'OrderHistory', component : VendorOrderHistoryComponent, outlet : 'data' },
   {path : 'Pending Orders', component : VendorPendingHistoryComponent, outlet : 'data' },
   {path : 'accept or reject', component : AcceptrejectComponent, outlet : 'data' },
   ]
 },
//    {path : '', component : CustomerloginComponent }, 
//    {path : 'OrderHistory', component : DashboardComponent }, 
//   {path : 'vendor', component : VendorloginComponent },
//   {path : 'menu', component : MenuComponent },
//   {path : 'dashBoard', component : VendordashboardComponent }



  {path : 'cmsmain', component : CmsmainComponent,
  children:
  [
  //{path : '', component : CustomerloginComponent }, 
    {path : 'vendorlogin', component : VendorloginComponent ,outlet :'data'}, 
    {path : 'customerlogin', component : CustomerloginComponent ,outlet :'data' }, 
    {path : 'logout', component : LogoutComponent ,outlet :'data' }, 
  ]
},
  {path : '', component : CmsmainComponent }, 

]

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    CustomerloginComponent,
    DashboardComponent,
    CustomerOrderHistoryComponent,
    CustomerPendingHistoryComponent,
    VendorloginComponent,
    VendorComponent,
    VendordashboardComponent,
    VendorOrderHistoryComponent,
    VendorPendingHistoryComponent,
    PlaceorderComponent,
    WalletComponent,
    MenuComponent,
    AcceptrejectComponent,
    CmsmainComponent,
    CancelorderComponent,
    LogoutComponent,
    CustomercancelorderComponent,
    CustomFilterPipe,
    QrCodeComponent,
    FreegiftComponent,
 
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpModule,
    QRCodeModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
