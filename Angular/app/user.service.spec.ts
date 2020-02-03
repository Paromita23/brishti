import { TestBed, inject } from '@angular/core/testing';

import { UserService } from './user.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('UserService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({ 
      providers: [UserService,HttpClient,HttpClientTestingModule], 
    });
  });

  // it('should be created Serv', inject([UserService], (service: UserService) => {
  //   expect(service).toBeTruthy();
  // }));


});
