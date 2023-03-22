class LandingPageStatus{

    namestatus(){
        return  cy.xpath('// *[@placeholder= "Ingresa nombre de status"]')
    }

    ModuleStatusComx(){
        return cy.xpath('//*[@id="sidebar"]/div/ul/li[3]/a')
    }

    BtonAcept(){
        return cy.xpath('// *[@class="dropdown-item size-18 text-cyan"]')
    }

    BtnGuardar(){
        return cy.xpath('// *[@type="submit"]')
    }

    MsgAprob(){
        return cy.xpath('//*[@class="text-info"]')
    }

    BtnMsgAprob(){
        return cy.xpath('//button[contains(text(),"Aceptar")]')
    }


}
export default LandingPageStatus