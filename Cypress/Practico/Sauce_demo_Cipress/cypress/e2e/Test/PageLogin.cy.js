import LandingPageLogin from "../../Integration/PageObject/LandingPageLogin.cy";

describe('Opensource', () => {

  const login = new LandingPageLogin

  beforeEach("setup", function(){
    cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    cy.viewport(1920,1080)
    cy.location('protocol').should('eq', 'https:')
    cy.contains("Login").should("be.visible")
    cy.title().should('eq','OrangeHRM')

  });
  
  
  it('TC1| VERIFICACION DE LOGEO', () => {
    login.username()
    .type('Admin')
    .should('have.value', 'Admin')

    login.password()
    .type("admin123")
    .should('have.value', 'admin123')

    cy.contains('. All rights reserved.')
    .should('be.visible')

    login.btnLogin()
    .should('be.visible')
    .click()
        
  });
})
