/* ==== Test Created with Cypress Studio ==== */
it('ConsultaBasica', function() {
  /* ==== Generated with Cypress Studio ==== */
cy.visit('https://saqatorresytorresfront.z13.web.core.windows.net/');
cy.get('.input-group > .form-control').type('lzambrano');
cy.get('.p-inputtext').type('12345678');
cy.get('.btn').click();
cy.wait(11000)
cy.get(':nth-child(18) > .status-table-cell > .d-flex > [alt="edit"]').click();
cy.get(':nth-child(11) > :nth-child(1) > lib-dropdown.ng-star-inserted > .p-inputwrapper > .w-100 > .p-dropdown-trigger > .p-dropdown-trigger-icon').click();
cy.get(':nth-child(1) > .p-ripple > .ng-star-inserted').click();
cy.get(':nth-child(11) > :nth-child(2) > .ng-star-inserted > .input-group > .form-control').type('ord23 R3');
  /* ==== End Cypress Studio ==== */
});