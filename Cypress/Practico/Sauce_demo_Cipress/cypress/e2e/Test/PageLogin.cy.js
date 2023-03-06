/// <reference types='Cypress'/>

import LandingPageLogin from "../../Integration/PageObject/LandingPageLogin.cy";

describe('Opensource', () => {

  const login = new LandingPageLogin

  beforeEach("setup", function(){
	
	//cy.fixture("datos").as("fx")
	cy.fixture("example").then((fix)=>{
	this.fx = fix
	})
	
    cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    cy.viewport(1920,1080)
    cy.location('protocol').should('eq', 'https:')
    cy.contains("Login").should("be.visible")
    cy.title().should('eq','OrangeHRM')

  });
  
  
  it('TC1| VERIFICACION DE LOGEO', () => {
    
	login.username()
	.type(this.fx.username)
	.should("have.value", this.fx.username)
    //.type('Admin')
    //.should('have.value', 'Admin')

    login.password()
	.type(this.fx.password)
	.should("have.value", this.fx.password)

    cy.contains('. All rights reserved.')
    .should('be.visible')

    login.btnLogin()
    .click()
        
  });
})
