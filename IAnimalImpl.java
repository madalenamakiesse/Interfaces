/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;


public class IAnimalImpl implements IAnimal {

    String ctg;
    
    @Override
    public String Category() {
        return ctg;
    }

    public IAnimalImpl(String ctg) {
        this.ctg = ctg;
    }
    
    
}
