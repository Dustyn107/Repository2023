class LandingPageStatusConsulta{

    StatusName(){
    
        return cy.xpath('//tbody/tr[2]/td[1]/div[1]/img[1]') // busca la ultima que se ha creado** status que se creo
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