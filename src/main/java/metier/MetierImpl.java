/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Karim-PC
 */
@Component
public class MetierImpl implements IMetier {

    //Couplage Faible
    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp * 223 * Math.cos(tmp);
        return res;
    }
    /**
    * Pour injecter dans la varible dao un objet d'une classe qui implémente 
    * l'interface IDao
    * @param dao 
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
