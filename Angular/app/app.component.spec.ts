import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { of } from 'rxjs';
import { UserService } from './user.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { HttpClient } from '@angular/common/http';



const userServiceStub = {
  getAllUsers() {
    console.log('came inside the stub');
    const users = [
      {
        "id": 1,
        "name": "Prasanna",
        "username": "prassucp@gmail.com",
        "email": "a@april.biz"
      },
      {
        "id": 2,
        "name": "Kushal",
        "username": "Junega",
        "email": "Shanna@melissa.tv"
      },
      {
        "id": 3,
        "name": "Clementine Bauch",
        "username": "Samantha",
        "email": "Nathan@yesenia.net"
      },
      {
        "id": 4,
        "name": "Patricia Lebsack",
        "username": "Karianne",
        "email": "Julianne.OConner@kory.org"
      },
      {
        "id": 5,
        "name": "Chelsey Dietrich",
        "username": "Kamren",
        "email": "Lucio_Hettinger@annie.ca"
      },
      {
        "id": 6,
        "name": "Mrs. Dennis Schulist",
        "username": "Leopoldo_Corkery",
        "email": "Karley_Dach@jasper.info"
      },
      // {
      //   "id": 7,
      //   "name": "Kurtis Weissnat",
      //   "username": "Elwyn.Skiles",
      //   "email": "Telly.Hoeger@billy.biz"
      // },
      // {
      //   "id": 8,
      //   "name": "Nicholas Runolfsdottir V",
      //   "username": "Maxime_Nienow",
      //   "email": "Sherwood@rosamond.me"
      // },
      // {
      //   "id": 9,
      //   "name": "Glenna Reichert",
      //   "username": "Delphine",
      //   "email": "Chaim_McDermott@dana.io"
      // },
      // {
      //   "id": 10,
      //   "name": "Clementina DuBuque",
      //   "username": "Moriah.Stanton",
      //   "email": "Rey.Padberg@karina.biz"
      // }
    ];
    return of( users );
  }
};

describe('AppComponent', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({ 
      imports: [ HttpClientTestingModule ],
      declarations: [
        AppComponent,
      ],
      providers: [{provide: UserService, 
        useValue: userServiceStub},
        HttpClient,
        HttpClientTestingModule]
    }).compileComponents();
  });
  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));
  it(`should have as title 'angular-testing'`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('Welcome to angular-testing!');
  }));
  it('should render title in a h1 tag', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement; 
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to angular-testing!');
  }));

  it('should render one employee record', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    fixture.whenStable().then(() => {
      fixture.detectChanges();
      const compiled = fixture.debugElement.nativeElement;
      expect(compiled.querySelectorAll('.employees tr').length).toBe(6);
    });
  }));
});
