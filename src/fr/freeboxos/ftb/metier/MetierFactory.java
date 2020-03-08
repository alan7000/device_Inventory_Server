/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.config.ConfigMarqueCpuService;
import fr.freeboxos.ftb.metier.config.ConfigMarqueCpuServiceImpl;

/**
 *
 * @author alan
 */
public class MetierFactory {

    private static final AutreService autreService = new AutreServiceImpl();

    public static AutreService getAutreService() {
        return autreService;
    }

    private static final CableService cableService = new CableServiceImpl();

    public static CableService getCableService() {
        return cableService;
    }

    private static final HDDService hddService = new HDDServiceImpl();

    public static HDDService getHDDService() {
        return hddService;
    }

    private static final MemoireService memoireService = new MemoireServiceImpl();

    public static MemoireService getMemoireService() {
        return memoireService;
    }

    private static final ProcesseurService processeurService = new ProcesseurServiceImpl();

    public static ProcesseurService getProcesseurService() {
        return processeurService;
    }

    private static final AdministrateurService administrateurService = new AdministrateurServiceImpl();

    public static AdministrateurService getAdministrateurService() {
        return administrateurService;
    }

    private static final OrdinateurService ORDINATEUR_SERVICE = new OrdinateurServiceImpl();

    public static OrdinateurService getOrdinateurService() {
        return ORDINATEUR_SERVICE;
    }

    private static final CarteGraphiqueService CARTE_GRAPHIQUE_SERVICE = new CarteGraphiqueServiceImpl();

    public static CarteGraphiqueService getCarteGraphiqueService() {
        return CARTE_GRAPHIQUE_SERVICE;
    }

    private static final CarteMereService CARTE_MERE_SERVICE = new CarteMereServiceImpl();

    public static CarteMereService getCarteMereService() {
        return CARTE_MERE_SERVICE;
    }

    private static final ConfigMarqueCpuService CONFIG_MARQUE_CPU_SERVICE = new ConfigMarqueCpuServiceImpl();

    public static ConfigMarqueCpuService getConfigMarqueCpuService() {
        return CONFIG_MARQUE_CPU_SERVICE;
    }

    private MetierFactory() {
    }
}
