/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collection;
import java.util.LinkedList;
import model.Stop;

/**
 *
 * @author Adrian
 */
public class StopsHardcodedMemoryLoader implements IStopsDataLoader {

    @Override
    public Collection<Stop> LoadData() {
        Collection<Stop> stopsCollection = new LinkedList<>();
        for (String stopSymbol : stopsSymbols) {
            stopsCollection.add(new Stop(stopSymbol));
        }
        return stopsCollection;
    }

    private String[] stopsSymbols = {
        "MT01",
        "MT02",
        "MT41",
        "MT43",
        "MT44",
        "MT72",
        "PK01",
        "PK02",
        "PK41",
        "PK42",
        "PP71",
        "PP72",
        "UE01",
        "UE02",
        "UP01",
        "UP02",
        "UP41",
        "UP42",
        "AWF01",
        "AWF02",
        "AWF03",
        "AWF04",
        "AWF41",
        "AWF42",
        "AWF43",
        "CZER01",
        "CZER02",
        "GDI01",
        "GDI02",
        "HCP71",
        "HCP72",
        "ITM02",
        "UAM02",
        "ZOO22",
        "OAK01",
        "OAK02",
        "OBA01",
        "OBA02",
        "OCZ01",
        "OCZ02",
        "OCZ41",
        "OCZ42",
        "L I01",
        "L I02",
        "L I04",
        "OOB02",
        "OPL01",
        "OPL02",
        "OPL03",
        "OPL41",
        "OPL42",
        "OPW02",
        "ORP02",
        "SOB01",
        "SOB30",
        "SOB42",
        "OWW01",
        "OWW02",
        "PLL01",
        "PLL02",
        "PLL04",
        "SNZ01",
        "SNZ02",
        "Z I01",
        "Z I02",
        "Z I41",
        "Z I42",
        "ADMI01",
        "ADMI02",
        "ALSO01",
        "ALSO02",
        "ALSO04",
        "ALSO41",
        "ALSO42",
        "ARCI01",
        "ARCI02",
        "ARCI41",
        "ARCI42",
        "AREN41",
        "AREN42",
        "ARPO01",
        "ARPO41",
        "ARPO42",
        "AZAL01",
        "AZAL02",
        "BALA01",
        "BALA02",
        "BALA03",
        "BALT42",
        "BALT71",
        "BALT95",
        "BAKA01",
        "BAKA02",
        "BAKA03",
        "BAKA41",
        "BAKA42",
        "BERG01",
        "BERG02",
        "BEDZ01",
        "BEDZ02",
        "BIGO01",
        "BIGO02",
        "BIGO03",
        "BIAL01",
        "BIAL02",
        "BIAL03",
        "BIEL01",
        "BIEL02",
        "BOBA01",
        "BOBA02",
        "BOWE01",
        "BOWE02",
        "BOJA01",
        "BOJA02",
        "BONN41",
        "BONN42",
        "BORI02",
        "BORA02",
        "BORO01",
        "BORO02",
        "BONY01",
        "BRAN01",
        "BRAN02",
        "BRON01",
        "BRON02",
        "BRZA01",
        "BRZA02",
        "BRZE01",
        "BRZE02",
        "BRZE03",
        "BUCZ01",
        "BUCZ02",
        "BUDZ01",
        "BUDZ02",
        "BUDZ41",
        "BUDZ42",
        "BUDZ44",
        "BUKO01",
        "BUKO02",
        "BUKO41",
        "BUKO42",
        "BUKI01",
        "BUKI02",
        "BURY01",
        "BURY02",
        "BUZA01",
        "BUZA02",
        "BYST01",
        "BYST02",
        "BYST41",
        "BYST42",
        "CEDR01",
        "CEDZ01",
        "CEDZ02",
        "CHAR01",
        "CHAR02",
        "CHAR04",
        "CHEM01",
        "CHEM02",
        "CHEM04",
        "CHOC01",
        "CHOC02",
        "CHKA01",
        "CHKA02",
        "CHRZ01",
        "CHRZ02",
        "CHWA01",
        "CIES01",
        "CMNA01",
        "CMNA02",
        "CMNA41",
        "CMNA42",
        "CZEK01",
        "CZEK02",
        "CZNZ01",
        "CZNZ02",
        "CZKA01",
        "CZKA02",
        "DARZ01",
        "DARZ02",
        "DASZ01",
        "DASZ02",
        "DEEC01",
        "DEEC02",
        "DEEC03",
        "DEEC06",
        "DEEC07",
        "DEEC42",
        "DENZ01",
        "DENZ02",
        "DEKA01",
        "DEKA02",
        "DMOW01",
        "DMOW02",
        "DOZD01",
        "DOZD02",
        "DOWI01",
        "DOWI02",
        "DRDE01",
        "DRDE02",
        "DRUS01",
        "DRUS02",
        "DRUZ01",
        "DRUZ02",
        "DRZE01",
        "DRZE02",
        "DRZE41",
        "DRZE42",
        "DUKI01",
        "DUKI02",
        "DWZA02",
        "DWZA71",
        "DWZA72",
        "DZIA01",
        "DZIA02",
        "DZIE01",
        "DZIE02",
        "DZWA01",
        "DZWA02",
        "DUNZ01",
        "DUNZ02",
        "EDWA01",
        "EDWA02",
        "ESTO01",
        "ESTO02",
        "FABI01",
        "FABI02",
        "FANZ01",
        "FASA01",
        "FASA02",
        "FOED01",
        "FOED02",
        "FORT01",
        "FORT02",
        "FRWO02",
        "FRWO42",
        "FRRY41",
        "FRRY42",
        "GALC01",
        "GALC02",
        "GARA02",
        "GABA01",
        "GABA02",
        "GABA04",
        "GDYN01",
        "GDYN02",
        "GDII01",
        "GDII02",
        "GDKA01",
        "GDKA02",
        "GERB01",
        "GERB02",
        "FRAN02",
        "GLHE01",
        "GLHE02",
        "GLHE06",
        "GLHE43",
        "GLHE44",
        "GLHE45",
        "GLHE71",
        "GLHE72",
        "GLOW01",
        "GLOW02",
        "GLOW03",
        "GLUS01",
        "GLUS02",
        "GLOS01",
        "GLOS02",
        "GLSZ01",
        "GLSZ02",
        "GNIE01",
        "GNIE02",
        "GNNZ01",
        "GNNZ02",
        "CMEN01",
        "CMEN02",
        "GOLE01",
        "GOLE02",
        "GOKA01",
        "GOKA02",
        "GOSP91",
        "GOSP92",
        "GORC21",
        "GORC30",
        "GORC42",
        "GORE01",
        "GORE02",
        "GORS01",
        "GORS02",
        "GROL02",
        "GRLA02",
        "GROC01",
        "GROC02",
        "GROC03",
        "GROC04",
        "GROC41",
        "GROC42",
        "GROD01",
        "GROD02",
        "GROT71",
        "GROT72",
        "GWAR02",
        "GWAR41",
        "HEWI01",
        "HEWI02",
        "HEWI03",
        "HEWI04",
        "HEWI41",
        "HEWI42",
        "HEZJ01",
        "HEZJ02",
        "HLDA01",
        "HLDA02",
        "HULE01",
        "HULE02",
        "INEA01",
        "INEA02",
        "INEA04",
        "INEA05",
        "INEA41",
        "INEA42",
        "INFL01",
        "INFL02",
        "INFL03",
        "INFI01",
        "INFI02",
        "INMR01",
        "INMR02",
        "JANI01",
        "JANI02",
        "JANZ01",
        "JANZ02",
        "JARO01",
        "JARO02",
        "JASN01",
        "JASN02",
        "JASN03",
        "JAWO01",
        "JAWO02",
        "JESI01",
        "JESI02",
        "JEZY01",
        "JEZY02",
        "JUGO01",
        "JUGO02",
        "JUNI02",
        "JUNI30",
        "JUNI42",
        "JUST02",
        "JUCM41",
        "KACZ01",
        "KACZ02",
        "KCNZ01",
        "KCNZ02",
        "KART01",
        "KART02",
        "KASZ01",
        "KATE01",
        "KATE02",
        "KATE41",
        "KATE42",
        "KATO01",
        "KATO02",
        "KAWI01",
        "KIEK02",
        "KIDW01",
        "KIDW02",
        "KIKO01",
        "KIKO02",
        "KINE01",
        "KLIN01",
        "KLIN02",
        "KLIN41",
        "KLIN42",
        "KMIE41",
        "KMIE42",
        "KOBY01",
        "KOBY02",
        "KOLE01",
        "KOLE02",
        "KOLE41",
        "KOLE42",
        "KOLO01",
        "KOLO02",
        "KMNZ02",
        "KONZ02",
        "KOPC01",
        "KOPC02",
        "KORD01",
        "KORD02",
        "KORD04",
        "KORF01",
        "KORF02",
        "KORO01",
        "KORO02",
        "KORA01",
        "KORA02",
        "KOSI71",
        "KOSI72",
        "KOSO01",
        "KOSO02",
        "KKNZ01",
        "KKNZ02",
        "KOSC01",
        "KOSC02",
        "KOTO01",
        "KOTO02",
        "KOWA02",
        "KOZM01",
        "KOZM02",
        "KORN02",
        "KORN41",
        "KORN42",
        "KORN43",
        "KORN44",
        "KORN45",
        "KORN93",
        "KRAJ01",
        "KRAJ02",
        "KRAN41",
        "KRAN42",
        "KRNZ01",
        "KRNZ02",
        "KRAS01",
        "KRAS02",
        "KRAS41",
        "KRAS42",
        "KRAU71",
        "KRAU72",
        "KRES01",
        "KRES02",
        "KRES03",
        "KRNY01",
        "KRNY02",
        "KRSZ01",
        "KRSZ02",
        "KRWI01",
        "KRWI02",
        "KRUS02",
        "KRZY01",
        "KRZY02",
        "KRZY04",
        "KSMI02",
        "KULY01",
        "KULY02",
        "KURL01",
        "KURL02",
        "KURP01",
        "KURP02",
        "KURP03",
        "KURP06",
        "KURP41",
        "KURP42",
        "LECH41",
        "LECH42",
        "LESZ01",
        "LESZ02",
        "LEKA01",
        "LEKA02",
        "LESK01",
        "LESK02",
        "LESK03",
        "LIBE01",
        "LIBE02",
        "LITE01",
        "LITE02",
        "LINZ01",
        "LINZ02",
        "LOKO01",
        "LOKO02",
        "LUBI01",
        "LUBI02",
        "LU I01",
        "LU I02",
        "LUII01",
        "LUII02",
        "LAWI01",
        "LAWI02",
        "LAKO41",
        "LAKO42",
        "LEDE91",
        "LEDE92",
        "LEGO01",
        "LEGO02",
        "LENZ01",
        "LENZ02",
        "LOMZ01",
        "LOMZ02",
        "LOMZ41",
        "LOMZ42",
        "LOPA01",
        "LOPA02",
        "LOPI01",
        "LOPI02",
        "LOZO01",
        "LOZO02",
        "LUGA01",
        "LUGA02",
        "LUPO01",
        "LUPO02",
        "LUCK01",
        "M1 I01",
        "M1 I02",
        "MAPO01",
        "MAPO02",
        "MALE01",
        "MALE02",
        "MALW01",
        "MALW02",
        "MANZ01",
        "MANZ02",
        "MAGA01",
        "MAGA02",
        "MAGA03",
        "MAGA04",
        "MAGA41",
        "MAGA42",
        "MARC01",
        "MARC02",
        "MARC03",
        "MARC04",
        "MRCI02",
        "MRCI71",
        "MRCI72",
        "MARL01",
        "MARL02",
        "MARS01",
        "MARS02",
        "MAGO01",
        "MAGO02",
        "MATE01",
        "MATE02",
        "MATE41",
        "MATE42",
        "MIED01",
        "MIED02",
        "MIED03",
        "MILC01",
        "MILO01",
        "MILO02",
        "MILO42",
        "MLYN01",
        "MLYN02",
        "MOGI02",
        "MORS01",
        "MORS02",
        "MODW02",
        "MODW03",
        "MODW41",
        "MODW42",
        "MORO01",
        "MORO71",
        "MORO72",
        "MOST01",
        "MRAG01",
        "MRAG02",
        "MURA41",
        "MURA42",
        "NJEZ01",
        "NJEZ02",
        "NADW01",
        "NADW02",
        "NADW41",
        "NADW42",
        "NAWA01",
        "NAWA02",
        "NARA01",
        "NARA02",
        "NAWI01",
        "NAWI02",
        "NASE01",
        "NASE02",
        "NASE03",
        "NASE04",
        "NAST01",
        "NAST02",
        "NIED01",
        "NIED02",
        "NIES01",
        "NIES02",
        "NIEZ01",
        "NIEZ02",
        "NIZA01",
        "NIZA02",
        "NOKO01",
        "NOGO01",
        "NOGO02",
        "OBOD01",
        "OBOD02",
        "OBOR01",
        "OBOR02",
        "OGNI01",
        "OGNI02",
        "OGDY01",
        "OGDY02",
        "OGDY04",
        "OGDY42",
        "OKOP01",
        "OKOP02",
        "OKUL01",
        "OKUL02",
        "OLIW91",
        "OLIW92",
        "OPAL01",
        "OPAL02",
        "OPIE01",
        "OPIE02",
        "OPNZ01",
        "OPNZ02",
        "OPOL01",
        "OPOL02",
        "OPOL92",
        "ORGN01",
        "ORGN02",
        "OSBI01",
        "OSBI02",
        "OSBA01",
        "OSBA02",
        "OSBA03",
        "OSBA04",
        "OBOH01",
        "OBOH02",
        "OSCH01",
        "OSCH02",
        "CZ I01",
        "CZ I02",
        "CZII01",
        "CZII02",
        "CIII01",
        "OSDE01",
        "OSDE02",
        "OJLY01",
        "OJLY02",
        "OSKO01",
        "OSKO02",
        "OKOS01",
        "OKOS02",
        "KWIA01",
        "KWIA02",
        "OSLE41",
        "OSLE42",
        "L II02",
        "LUGO01",
        "LUGO02",
        "OLOK02",
        "OSLO01",
        "OSLO02",
        "OM I01",
        "OM I02",
        "OMII01",
        "OMII02",
        "OB I01",
        "OB I02",
        "OBII01",
        "OBII02",
        "OBNZ02",
        "OSWI01",
        "OSWI02",
        "OPIA01",
        "OPIA02",
        "OPIA41",
        "OPIA42",
        "OSPO01",
        "PRZM01",
        "PRZM02",
        "OPRZ01",
        "OPRZ02",
        "RUSA01",
        "RUSA02",
        "R SZ01",
        "R SZ02",
        "R SZ04",
        "ORZE01",
        "ORZE02",
        "ORZE41",
        "ORZE42",
        "OSSL01",
        "OSSL02",
        "SO I01",
        "SO I02",
        "SOII01",
        "SZII01",
        "SZII02",
        "OSTY41",
        "OSTY42",
        "OT I01",
        "OT I02",
        "WINI01",
        "WINI02",
        "WINI41",
        "WINI42",
        "OSZO01",
        "OSZO02",
        "OSZW01",
        "OSZW02",
        "OSZY01",
        "OSZY02",
        "OSIA01",
        "OSIA02",
        "OSTR01",
        "OSTR02",
        "OSTR41",
        "OSTR42",
        "OSNZ01",
        "OSNZ02",
        "OWCZ01",
        "OWCZ02",
        "OZIM01",
        "OZIM02",
        "OZAR01",
        "OZAR02",
        "PALA01",
        "PALA02",
        "PALM01",
        "PALM02",
        "PAMI71",
        "PAMI72",
        "PAWI01",
        "PAWI02",
        "PAWI71",
        "PAWI72",
        "PASI41",
        "PASI42",
        "PERZ02",
        "PINZ01",
        "PINZ02",
        "PIAS01",
        "PIAS02",
        "PIAR41",
        "PIAR42",
        "PIAT01",
        "PIAT02",
        "PIAT03",
        "PIAT04",
        "PIAT42",
        "PILO01",
        "PILO02",
        "PILS01",
        "PILS02",
        "PINC01",
        "PINC02",
        "PIOT01",
        "PIOT02",
        "PIWN01",
        "PIWN02",
        "PIWN03",
        "PIWN04",
        "PLCR41",
        "PLCR42",
        "PLWI41",
        "PLWI42",
        "PLWL41",
        "PLWL42",
        "PLWO02",
        "PLWO41",
        "PLBE02",
        "PLBE71",
        "PLBE72",
        "PLON01",
        "PODL01",
        "PODL02",
        "PODR01",
        "PODR02",
        "PODO01",
        "PODO02",
        "PODO03",
        "PODO04",
        "PDNZ01",
        "PDNZ02",
        "POKR01",
        "POKR02",
        "POKA41",
        "POKA42",
        "PONA71",
        "PONA72",
        "POLN01",
        "POLN02",
        "POLO01",
        "POLO02",
        "PONZ01",
        "PONZ02",
        "POLA01",
        "POLA02",
        "POLA03",
        "POLA42",
        "PSAM01",
        "PSAM02",
        "POGL03",
        "POGL04",
        "POGL41",
        "POGL42",
        "POGL73",
        "POGL74",
        "POZN41",
        "POZN42",
        "POLW01",
        "POLW02",
        "POLW41",
        "POLW42",
        "PROM01",
        "PROM02",
        "PRZA01",
        "PRZA02",
        "PLOT01",
        "PLOT02",
        "PZEL41",
        "PZEL42",
        "PRNZ02",
        "PRNZ04",
        "PSAR01",
        "PSAR02",
        "PSPK01",
        "PUST01",
        "PUST02",
        "PUST41",
        "PUST42",
        "PUSA02",
        "RADO01",
        "RA I02",
        "RAII01",
        "RAII02",
        "RAKA01",
        "RAKA02",
        "RAKO01",
        "RAKO02",
        "RAKO03",
        "ROBO01",
        "ROBO02",
        "RODA01",
        "RODA02",
        "ROLN03",
        "ROLN04",
        "ROLN41",
        "ROLN42",
        "ROLN91",
        "RJNJ01",
        "RJNJ02",
        "RJNJ41",
        "RJNJ42",
        "RJNJ73",
        "RJNJ74",
        "RKAP01",
        "RKAP02",
        "RKAP33",
        "RKAP34",
        "RKAP91",
        "ROMI01",
        "ROMI02",
        "ROMI03",
        "ROOB01",
        "ROOB02",
        "RRAT01",
        "RRAT02",
        "RRAT03",
        "RRAT04",
        "RRAT08",
        "RRAT30",
        "RRAT41",
        "RRAT42",
        "RRAT43",
        "RRAT44",
        "ROSO01",
        "ROSO02",
        "ROSO03",
        "ROSO04",
        "ROSO41",
        "ROSO42",
        "RSTA01",
        "RSTA02",
        "RSTA03",
        "RSTA41",
        "RSTA42",
        "RSTA43",
        "RSTA44",
        "RSTA45",
        "RSTA46",
        "RSTA47",
        "RSTA48",
        "ROSR01",
        "ROSR02",
        "ROSR03",
        "ROSR04",
        "ROSR30",
        "ROSR41",
        "ROSR42",
        "ROSR43",
        "ROSR44",
        "ROSR45",
        "ROSR46",
        "ROSR47",
        "RZEG41",
        "RZEG42",
        "ROZA41",
        "ROZA42",
        "RUBI01",
        "RUBI02",
        "RUDN01",
        "RUDN02",
        "RUMA01",
        "RUMA02",
        "RYCE01",
        "RYCE02",
        "RYCE04",
        "RJEZ71",
        "RJEZ72",
        "RJEZ73",
        "RJEZ74",
        "RYLA71",
        "RYLA72",
        "RYWI43",
        "RYWI44",
        "RYWI71",
        "RYWI72",
        "RWSC01",
        "RWSC02",
        "RZEP01",
        "RZEP02",
        "SAFO01",
        "SANT01",
        "SANT02",
        "SARM01",
        "SARM02",
        "SOEJ01",
        "SOEJ02",
        "SJNZ01",
        "SJNZ02",
        "SERA01",
        "SERA41",
        "SERA42",
        "SIEL71",
        "SIEL72",
        "SIEW01",
        "SIEW02",
        "SKIB91",
        "SKIB92",
        "SLKA01",
        "SLKA02",
        "SLKA03",
        "SLKA04",
        "SLKA06",
        "SLKA41",
        "SLKA42",
        "SLUP01",
        "SLUP02",
        "SMOC01",
        "SMOC02",
        "SMNA01",
        "SMNA02",
        "SMGO01",
        "SMGO02",
        "SMGO03",
        "SMGO41",
        "SMGO42",
        "SMOL01",
        "SMOL02",
        "SOBI01",
        "SOBI02",
        "SOCH02",
        "SOLN01",
        "SOLN02",
        "SOLA41",
        "SOLA42",
        "SPLA02",
        "SPKA01",
        "SPKA02",
        "STAW01",
        "STAW02",
        "STAR01",
        "STAR02",
        "STAR04",
        "STAR21",
        "STAR30",
        "STAR42",
        "STAR43",
        "STWI01",
        "STWI02",
        "STWI05",
        "STAS01",
        "STAS02",
        "STOB01",
        "STOB02",
        "STOI01",
        "STOI02",
        "STOI03",
        "STOI04",
        "STOM01",
        "STOM02",
        "STOM41",
        "STOM42",
        "STOM43",
        "STRO01",
        "STRO02",
        "STRU01",
        "STRU02",
        "STRZ01",
        "STRZ02",
        "SZYN01",
        "SZYN02",
        "SZYN03",
        "SZYN04",
        "SZYN21",
        "STEK01",
        "STEK02",
        "STNZ01",
        "STNZ02",
        "ST I01",
        "ST I02",
        "STII01",
        "STII02",
        "STRA01",
        "STRA02",
        "STUD01",
        "STUD02",
        "SUCH01",
        "SUCH02",
        "SUSZ01",
        "SUSZ02",
        "SWOB01",
        "SWOB02",
        "SYCO01",
        "SYCO02",
        "SYNZ01",
        "SYNZ02",
        "AUCH02",
        "SYPU01",
        "SYPU02",
        "SYPN02",
        "SZAM01",
        "SZAM02",
        "SZSZ01",
        "SZSZ02",
        "SS I01",
        "SS I02",
        "SZKA01",
        "SZKA02",
        "SZWO01",
        "SZWO02",
        "SZLI01",
        "SZLI02",
        "SZNZ01",
        "SZLU01",
        "SZLU02",
        "SZLU41",
        "SZLU42",
        "SMSW02",
        "SZRE01",
        "SZRE02",
        "SZPI01",
        "SZPI02",
        "SZPI03",
        "SZPI04",
        "SZWA41",
        "SZWA42",
        "SZWE41",
        "SZWE42",
        "SZYL01",
        "SZYL02",
        "SZYM01",
        "SZYM02",
        "SZYM04",
        "SZYM08",
        "SZYM41",
        "SZYM42",
        "SSKA01",
        "SSKA02",
        "SCIE01",
        "SCIE02",
        "SCIE03",
        "SCIE04",
        "SLAS01",
        "SLAS02",
        "SLEZ01",
        "SLEZ02",
        "SLEZ04",
        "SMIE01",
        "SMIE02",
        "SWAN01",
        "SWAN02",
        "SWAN03",
        "SWAC01",
        "SWAC02",
        "SWAK01",
        "SWAK02",
        "SWCZ71",
        "SWCZ72",
        "SWLE01",
        "SWLE02",
        "SWLE41",
        "SWLE42",
        "SWMI41",
        "SWMI42",
        "SWIA01",
        "SWIA02",
        "SWIE01",
        "SWIE02",
        "SWRZ01",
        "SWRZ02",
        "TACZ01",
        "TACZ02",
        "TARC01",
        "TARC02",
        "TARN01",
        "TARN02",
        "TAKA01",
        "TAKA02",
        "TATR01",
        "TATR02",
        "TERM01",
        "TERM02",
        "TERM03",
        "TERM04",
        "TERM41",
        "TERM42",
        "TEMA01",
        "TECZ01",
        "TECZ02",
        "TOLT01",
        "TOLT02",
        "TOMA01",
        "TOMA02",
        "TORO01",
        "TO I71",
        "TRAU01",
        "TRAU02",
        "TRAU42",
        "TRAU43",
        "TRAU44",
        "TRAU71",
        "TREB01",
        "TREB02",
        "TROJ01",
        "TROJ02",
        "TRUS01",
        "TRUS02",
        "TRZE01",
        "TRZE02",
        "TULO01",
        "TULO02",
        "TYNZ02",
        "ULAN01",
        "ULAN02",
        "UMTA01",
        "UMTA02",
        "UMUL01",
        "UMUL02",
        "UMUL03",
        "UMUL04",
        "UMUL05",
        "URAD01",
        "URAD02",
        "URBA02",
        "URSZ01",
        "URSZ02",
        "URWI01",
        "URWI02",
        "URWO01",
        "WARO01",
        "WARO02",
        "WEGO01",
        "WEGO02",
        "WEGO41",
        "WEGO42",
        "WIAD01",
        "WIAD02",
        "WIAN01",
        "WIAN02",
        "WICH01",
        "WICH02",
        "WDNZ01",
        "WDNZ02",
        "WIEC01",
        "WIEC02",
        "WIEL01",
        "WIKA01",
        "WIKA02",
        "WIKA41",
        "WIKA42",
        "WIEP01",
        "WIEP02",
        "WIER41",
        "WIER42",
        "WRTV01",
        "WRTV02",
        "WILC01",
        "WILC02",
        "WILC03",
        "WILC04",
        "WILC42",
        "WIII01",
        "WIII02",
        "WIII04",
        "WIML01",
        "WIML02",
        "WIMO01",
        "WIMO02",
        "WIGR01",
        "WIGR02",
        "WIOS41",
        "WIOS42",
        "WIKL02",
        "WIWI02",
        "WLOD01",
        "WLOD02",
        "WLOA01",
        "WLOA02",
        "WOKI01",
        "WOKI02",
        "WOPO01",
        "WOPO02",
        "WOPO03",
        "WOPO04",
        "WOJS01",
        "WOJS41",
        "WOLK01",
        "WOLK02",
        "WOLO01",
        "WOLO02",
        "WOJT01",
        "WROC71",
        "WROC72",
        "WSPO42",
        "WSPO71",
        "WSNZ91",
        "WSNZ92",
        "WYKO01",
        "WYLO01",
        "WYLO02",
        "WYSP01",
        "WYSP02",
        "ZAKL01",
        "ZAKL02",
        "ZAME01",
        "ZAME02",
        "ZAWA01",
        "ZAWA02",
        "ZAWA03",
        "ZAWA42",
        "ZEYL41",
        "ZEYL42",
        "ZGOR01",
        "ZGOR02",
        "ZIEL01",
        "ZIEL02",
        "ZIEM01",
        "ZIEM02",
        "ZLOT01",
        "ZLOT02",
        "ZNTK01",
        "ZNTK02",
        "ZEGL01",
        "ZEGL02",
        "Z II01",
        "Z II02",
        "Z II41",
        "Z II42",
        "ZIII01",
        "ZIII02",
        "ZIII41",
        "ZIII42",
        "ZELA01",
        "ZELA02",
        "ZERO01",
        "ZERO02",
        "ZERO03",
        "ZERO06",
        "ZERO41",
        "ZERO42",
        "ZERO73",
        "ZNIW41",
        "ZNIW42",
        "ZONK01",
        "ZONK02",
        "ZYNA01",
        "BIJDW01",
        "BIJDW02",
        "BIJES01",
        "BIJES02",
        "BIMLY01",
        "BIMLY02",
        "BIPRK02",
        "BGPET02",
        "BOFAU01",
        "BOFAU02",
        "BOKAS01",
        "BOKAS02",
        "BOOGR01",
        "BOOGR02",
        "BOWOJ01",
        "BOWOJ02",
        "CECME01",
        "CEELE01",
        "CEELE02",
        "CEKRE01",
        "CEKRE02",
        "CEPRL01",
        "CEPRL02",
        "CESTA01",
        "CESTA02",
        "CESZK01",
        "CESZK02",
        "JAASF01",
        "JAASF02",
        "JAOGR01",
        "KCJON01",
        "KCJON02",
        "KCPET01",
        "KCSZK01",
        "KCSZK02",
        "KZDZI01",
        "KZDZI02",
        "KZKRO01",
        "KZKRO02",
        "KZLIP01",
        "KZLIP02",
        "KZOSK01",
        "KZOSK02",
        "KZOSL01",
        "KZOSL02",
        "KZCOS01",
        "KZCOS02",
        "KZSZK02",
        "KZSZK04",
        "KZPLY01",
        "KZPLY02",
        "KZTJE01",
        "KZTJE02",
        "KZTDW01",
        "KZTDW02",
        "KZZDR01",
        "KZZDR02",
        "LUDEB01",
        "LUKLO01",
        "LUKLO02",
        "LUKLL01",
        "LUKLL02",
        "LUKOS01",
        "LUKOS02",
        "LUKRE01",
        "LUNIE01",
        "LUNIE02",
        "LUORL01",
        "LUORL02",
        "LUOLU01",
        "LUOLU03",
        "LUOSK01",
        "LUOSK02",
        "LUPAR01",
        "LUPAR02",
        "LUPBO01",
        "LUPBO02",
        "LUPOD01",
        "LUPOD02",
        "LUPRZ01",
        "LUPRZ91",
        "LUSIK01",
        "LUSIK02",
        "LUSTP02",
        "LUSTP04",
        "LUSZN01",
        "LUSZN02",
        "LUTRA01",
        "LUTRA03",
        "LUUNI01",
        "LUUNI02",
        "LUWPL01",
        "LUWPL04",
        "LUZAB01",
        "LUZAB02",
        "MGCME01",
        "MGCME02",
        "MGJOD01",
        "MGJOD02",
        "MGKRT02",
        "MGLES01",
        "MGLES02",
        "MGMOD01",
        "MGNRY01",
        "MGOKR01",
        "MGOKR02",
        "MGRYN01",
        "MGRYN02",
        "MWKOL01",
        "MWKOL02",
        "OWOGR01",
        "OWOGR02",
        "OWKSP01",
        "OWKSP02",
        "OWPAL01",
        "OWPAL02",
        "PRPLN01",
        "PRPLN02",
        "PDPAR01",
        "PDPAR02",
        "PDPET01",
        "SDKUP02",
        "SDKUP04",
        "SDCEG01",
        "SDCEG02",
        "SDRAC01",
        "SDRAC02",
        "SDPRZ01",
        "SDPRZ02",
        "SDSZU01",
        "SDSZU02",
        "SHCIN01",
        "SHCIN02",
        "ZAGIM02",
        "SWMN(x)01"};
}