class LandingPageStatusConsulta{

    StatusName(){
    
        return cy.xpath('//tbody/tr[20]/td[1]/div[1]/img[1]') // busca la ultima que se ha creado** status que se creo
         // se debe agregar en el tr el numero a consultar
    }
    
    Search(){

        return cy.get('.form-control')//cy.xpath('//input[@placeholder="Buscar status"] or [@class ="form-control ng-pristine ng-invalid ng-touched"] ')
    }
    BtnGuardarFormul(){
        return cy.xpath('//button[@normalize-space()="Guardar"]')
    }
    
    BtnCloseFormul(){
        return cy.xpath('//div[@class="me-3"]//lib-close-button')
    }

    BtnConfirm(){
    return cy.xpath('//button[normalize-space()="Guardar"]')
    }

    
}
export default LandingPageStatusConsulta