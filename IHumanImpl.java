/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;


public class IHumanImpl implements IHuman {
    
    String wflow;
    String ctg;
    
    @Override
    public String WorkFlow() {
        return wflow;
    }

    @Override
    public String Category() {
        return ctg;
    }

    public IHumanImpl(String wflow, String ctg) {
        this.wflow = wflow;
        this.ctg = ctg;
    }
    
    
}
