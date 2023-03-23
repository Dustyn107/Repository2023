/// <reference types='Cypress'/>
import LandingPageLogin from "../../Integration/POM/LandingPageLogin.cy";
import LandingPageStatusConsulta from "../../Integration/POM/LandingPageStatusConsulta.cy";
import LandingPageStatus from "../../Integration/POM/LandingPageStatus.cy";

describe("Consulta de Status creado", () => {
  const login = new LandingPageLogin();
  const consul = new LandingPageStatusConsulta();
  const status = new LandingPageStatus();

  beforeEach("setup", function () {
    cy.fixture("data").then((fix) => {
      this.fx = fix;
    });

    cy.visit("https://saqatorresytorresfront.z13.web.core.windows.net/");
    cy.viewport(1920, 1080);
    cy.location("protocol").should("eq", "https:");
    cy.title().should("eq", "Grupo Torres & Torres");
  }); // cierre del beforeEach

it("TC2| Consulta de Status", function () {
    login
    .username()
    .type(this.fx.username)
    .should("have.value", this.fx.username);

    login.password().type(this.fx.password);

    login.btnLogin().click();

    cy.wait(11000);

    //verificacion de que se encuentra en la pagina de dashboard
    cy.url().should("contain", "/dashboard/main");

    //consulta primero en el buscador con el numero de status creado
    //consul.Search().type(this.fx.DescriptionStatus);
    //cy.wait(10000)

    consul.StatusName().click();
    cy.wait(6000);

    //diligenciamiento de formulario

    cy.xpath("//tbody/tr[2]/td[1]/lib-dropdown[1]/p-dropdown[1]/div[1]/span[1]").click({force: true});  
    cy.wait(4000)
    cy.contains('En Produccion').click()
    cy.get(':nth-child(1) > :nth-child(2) > .ng-star-inserted > .input-group > .form-control')
    .type("ASDF").should('have.value','ASDF')

    cy.get(':nth-child(1) > :nth-child(3) > .ng-star-inserted > .input-group > .form-control').type("00123")
    .should('have.value','00123')

    cy.get(':nth-child(1) > :nth-child(4) > .ng-star-inserted > .input-group > .form-control').type("CIATEITE")
    .should('have.value','CIATEITE')

    cy.get(':nth-child(1) > :nth-child(5) > .ng-star-inserted > .input-group > .form-control').type("NO")
    .should('have.value','NO')

    cy.get(':nth-child(1) > :nth-child(6) > .ng-star-inserted > .input-group > .form-control').type("TEST")
    .should('have.value','TEST')

    cy.get(':nth-child(1) > :nth-child(7) > .ng-star-inserted > .input-group > .form-control').type("TELSUPREMA")
    .should('have.value','TELSUPREMA')

    cy.get(':nth-child(1) > :nth-child(8) > .ng-star-inserted > .input-group > .form-control').type("FEDRAL S.A.")
    //.should('have.value','FEDRAL S.A.')

    cy.wait(2000)
    
    cy.get('.justify-content-around > :nth-child(3) > .p-element')
    .click()
    cy.wait(2000)

    //cy.get('.mt-3 > :nth-child(1) > .p-element')
    cy.xpath('//button[normalize-space()="Guardar"]')
    .click()

    consul.BtnCloseFormul().click()

    //consul.BtnConfirm()
    //.click()

    cy.wait(2000)
});

it.only('carga de archivos', function() {

    login
    .username()
    .type(this.fx.username)
    .should("have.value", this.fx.username);

    login.password().type(this.fx.password);

    login.btnLogin().click();

    cy.wait(11000);

    //verificacion de que se encuentra en la pagina de dashboard
    cy.url().should("contain", "/dashboard/main");
    //consulta en el buscador con el numero de status creado
    consul.Search().type(this.fx.DescriptionStatus);

    consul.StatusName().click();
    cy.wait(3000);

    cy.contains('Seleccione uno')
    .parent()
    .find('//*[@id="pr_id_25-table"]/tbody[1]/tr[2]')
    cy.wait(6000)

    cy.contains('Seleccione uno')
    .parent('span')
    .should('have.class', 'completed')

    
});

});
