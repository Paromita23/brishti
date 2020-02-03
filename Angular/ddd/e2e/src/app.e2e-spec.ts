import { AppPage } from './app.po';
import { browser, by, element } from 'protractor';

// describe('Enter GURU99 Name', function() {
//   it('should add a Name as GURU99', function() {
//   browser.get('https://angularjs.org');
//   element(by.model('yourName')).sendKeys('GURU99');
//    var guru= element(by.xpath('html/body/div[2]/div[1]/div[2]/div[2]/div/h1'));
//  expect(guru.getText()).toEqual('Hello GURU99!');
//    });
//  });

// spec.js

describe('Protractor Demo App', function() {
  var firstNumber = element(by.model('first'));
  var secondNumber = element(by.model('second'));
  var goButton = element(by.id('gobutton'));
  var latestResult = element(by.binding('latest'));

  beforeEach(function() {
    browser.get('http://juliemr.github.io/protractor-demo/');
  });

  it('should have a title', function() {
    expect(browser.getTitle()).toEqual('Super Calculator');
  });

  it('should add one and two', function() {
    firstNumber.sendKeys(1);
    secondNumber.sendKeys(2);

    goButton.click();

    expect(latestResult.getText()).toEqual('3');
  });

  it('should add four and six', function() {
    // Fill this in.
    expect(latestResult.getText()).toEqual('0');
  });

  it('should read the value from an input', function() {
    firstNumber.sendKeys(1);
    expect(firstNumber.getAttribute('value')).toEqual('1');
  });
});

describe('Protractor Demo App', function() {
  it('should add one and two', function() {
    browser.get('http://juliemr.github.io/protractor-demo/');
    element(by.model('first')).sendKeys(1);
    element(by.model('second')).sendKeys(2);

    element(by.id('gobutton')).click();

    expect(element(by.binding('latest')).getText()).
        toEqual('3'); // This is wrong!
  });
});

describe('Protractor Demo App', function() {
  it('should have a title', function() {
    browser.get('http://juliemr.github.io/protractor-demo/');

    expect(browser.getTitle()).toEqual('Super Calculator');
  });
});

describe('workspace-project App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to ProtTest!');
  });
});

// describe('Protractor Demo', function() {
//   it('to check the page title', function() {
//   browser.ignoreSynchronization = true;
//   browser.get('https://www.softwaretestinghelp.com/');
//   browser.driver.getTitle().then(function(pageTitle) {
//   expect(pageTitle).toEqual('Software Testing Help - A Must Visit Software Testing Portal');
//   });
//   });
//   });

describe('Code to interact with Angular JS elements', function() {
it('should multiply two integers', function() {
browser.get('http://juliemr.github.io/protractor-demo/');
element(by.model('first')).sendKeys(5);
element(by.model('second')).sendKeys(5);
element(by.model('operator')).click();
element(by.xpath(".//option[@value= 'MULTIPLICATION']")).click();
element(by.id('gobutton')).click();
expect(element(by.binding('latest')) .getText()).toEqual('10'); //Incorrect expectation
expect(element(by.binding('latest')) .getText()).toEqual('25'); //Correct expectation
});
});
