/// <reference types='Cypress'/>
import LandingPageLogin from "../../Integration/POM/LandingPageLogin.cy";
import LandingPageStatus from "../../Integration/POM/LandingPageStatus.cy";



describe("Torres_Torres", () => {

  const login = new LandingPageLogin
  const status = new LandingPageStatus
  

  beforeEach("setup", function () {
    cy.fixture("data").then((fix) => {
      this.fx = fix;
    });

    cy.visit("https://saqatorresytorresfront.z13.web.core.windows.net/");
    cy.viewport(1920, 1080);
    cy.location("protocol").should("eq", "https:");
    cy.title().should("eq", "Grupo Torres & Torres");
  }); // cierre del beforeEach

  

  it('TC1| Creacion de Status', function() {

    login.username()
    .type(this.fx.username)
    .should("have.value", this.fx.username)

    login.password()
    .type(this.fx.password)

    login.btnLogin()
    .click()

    cy.wait(15000)
    
//verificacion de que se encuentra en la pagina de dashboard
    cy.url().should("contain","/dashboard/main")

   //Ingreso al modulo de Satuts Comex
    status.ModuleStatusComx()
    .click()

//Diligenciamiento del nuevo status
    status.namestatus()
    .type(this.fx.DescriptionStatus)
    .should("have.value", this.fx.DescriptionStatus)

    status.BtonAcept()
    .click()

    status.BtnGuardar()
    .click()

    cy.on('window:alert',(str) =>{
      expect(str).to.equal('Status agregado');
    });

    status.BtnMsgAprob()
    .click()

    cy.wait(4000)


    
  });

}); // primer describe
