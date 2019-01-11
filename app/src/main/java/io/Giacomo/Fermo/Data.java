package io.Giacomo.Fermo;

import android.content.Context;

import java.util.ArrayList;

import java.io.Serializable;

/**
 * This class is responsible for providing the application with data
 *
 * @author Giacomo Cochetti
 */
class Data {

    /**
     * What to see in Fermo
     *
     * @param c c
     * @return visit list
     */
    static ArrayList<Attraction> getVisitList(Context c) {
        ArrayList<Attraction> attrList = new ArrayList<>();

        // Piazza Fermo
        attrList.add(new Attraction(
                "Square",
                (float) 4.7,
                R.drawable.piazza,
                "Fermo square is one of the main attraction of the city. The original architecture is dated 1439 and is long 135 meters and long 34. Very busy and crowded during the night, it is the perfect place to enjoy the landscape and drink in one of the multiple bars around.",
                "0734229191",
                "http://www.turismo.marche.it/Dettaglio/Title/Fermo-Piazza-del-Popolo/IdPOI/6201/C/109006",
                43.161309, 13.718345));

        // Roman Cisterns
        attrList.add(new Attraction(

                "Roman Cisterns",
                (float) 4.7,
                R.drawable.cisterns,
                "This remarkable underground complex is arranged in a rectangular layout subdivided into 30 rooms in 3 parallel rows and was built at the end of the first century BC to supply the city with drinking water. Incredibly it was still being used in the 1980's to store water. Visitors can only enter with a guide and tickets can be bought from the tourist office, which has a small shop, on the ground floor of the Priors Palace nearby in the Piazza del Popolo",
                "0734 217140",
                "http://www.comune.fermo.it/it/cisterne-romane",
                 43.161199, 13.719202));

        // Duomo cathedral
        attrList.add(new Attraction(
                "Cathedral",
                (float) 4.6,
                R.drawable.n,
                "Archaeological excavations have demonstrated that the cathedral site was formerly that of a pagan temple. The first church was destroyed in 1176 during the campaign of Frederick I, Holy Roman Emperor. It was rebuilt in 1227 under the patronage of Giorgio da Como. Construction was pursued over the following decades leading to the present façade with both Romanesque and Gothic elements and built in Istrian stone. The rose window was sculpted by Giacomo Palmieri in 1348. The portal niche has a bronze statue of the Madonna of the Assumption by Nunzio Ucinelli. The atrium has frescoes from the 14th-century and the funeral monument of Giovanni Visconti d’Oleggio. The base of the bell-tower also dates from the early church.",
                "0734221431",
                "http://cst.comune.fermo.it/default.aspx?menuid=1693",
                 43.161098, 13.716849));

        // Pinacoteca
        attrList.add(new Attraction(
                "Palazzo Dei Priori",
                (float) 4.5,
                R.drawable.priori,
                "Fermo’s Palazzo dei Priori – which was given its current fan-shaped profile in the 1500s, incorporating a 13th-century building and a church dedicated to Saint Martin – is also home to a masterpiece of Baroque painting, “The Adoration of the Magi” by Pieter Paul Rubens.Finally, inside you’ll find the Archaeological Museum and the Spezioli Library: the oldest and most prestigious in Marche, it developed around the Globe Hall – named after its wonderful and extremely detailed handwritten globe, which was designed by cartographer Amanzio Moroncelli in 1713.",
                "0734227391",
                "http://cst.comune.fermo.it/default.aspx?menuid=1687",
                 43.160887, 13.718353));

        return attrList;
    }

    /**
     * What to eat in Fermo
     *
     * @return eat list
     */
    static ArrayList<Attraction> getEatList(Context c) {
        ArrayList<Attraction> attrList = new ArrayList<>();

        // Palio
        attrList.add(new Attraction(
                "Locanda Del Palio",
                (float) 4.4,
                R.drawable.locanda,
                "Homemade typical food in a nice friendly environment. The Owner Carlo, is leading the restaurant since 50 years.PRICE: 2/5 QUALITY:4/5",
                "0734 229221",
                "https://www.tripadvisor.co.uk/Restaurant_Review-g1025201-d1213860-Reviews-Locanda_del_Palio-Fermo_Province_of_Fermo_Marche.html",
                43.162428, 13.717285));

        // Emilio
        attrList.add(new Attraction(
                "Ristorante Emilio",
                (float) 4.1,
                R.drawable.emi,
                "Another coosy restaurant where to enjoy the famous fried Olive all Ascolana. Very good selections of wines in a ancient underground environment. PRICE:1/5 QUALITY 3/5,",
                "0734229451",
                "https://www.tripadvisor.co.uk/Restaurant_Review-g1025201-d1177391-Reviews-Ristorante_Emilio-Fermo_Province_of_Fermo_Marche.html",
                43.161034, 13.711003));

        // artisti
        attrList.add(new Attraction(
                "Osteria Artisti",
                (float) 4.2,
                R.drawable.artisti,
                "Fancy restaurant where you can try all the possible delicatesse from our Region. The service is effiecient and the personal will look after you to fullfill all your foodie desires. PRICE: 4/5 QUALITY 4/5",
                "0734227013",
                "https://www.tripadvisor.it/Restaurant_Review-g1025201-d4291229-Reviews-Trattoria_degli_Artisti-Fermo_Province_of_Fermo_Marche.html",
                43.161658, 13.712765));

        // Pizzicosa
        attrList.add(new Attraction(
                "Pizzicosa",
                (float) 4.6,
                R.drawable.pizzi,
                "Pizzicosa is an institution of Pizza in Fermo. Very coosy place plenty of pizza choices and good variety of beers.",
                "0734884207",
                "https://www.tripadvisor.it/Restaurant_Review-g1025201-d4167313-Reviews-La_Pizzicosa-Fermo_Province_of_Fermo_Marche.html",
                 43.162406, 13.717340));

        return attrList;
    }

    /**
     * Where to drink in Fermo
     *
     * @return drink list
     */
    static ArrayList<Attraction> getDrinkList(Context c) {
        ArrayList<Attraction> attrList = new ArrayList<>();

        // Enoteca San Rocco
        attrList.add(new Attraction(
                "Enoteca San Rocco",
                        (float) 4.3,
                R.drawable.rocco,
                "Exeptional wine bar located in the beautiful central square. Very good selections of wines and beer, reccomanded to visit during nightime for the atmosphere.",
                "0734225374",
                "https://www.tripadvisor.co.uk/Restaurant_Review-g1025201-d4128733-Reviews-Locanda_San_Rocco-Fermo_Province_of_Fermo_Marche.html",
                43.160978, 13.718253));

        // Bar Belli
        attrList.add(new Attraction(
                "Bar Belli",
                (float) 4.7,
                R.drawable.belli,
                "One of the most historical bar in Fermo. Enjoy great cocktails or aperitives while you enjoy the beautiful Fermo view above its big terrace open space.",
                "0734226219",
                "https://www.tripadvisor.co.uk/Restaurant_Review-g1025201-d10660342-Reviews-Gran_Caffe_Belli-Fermo_Province_of_Fermo_Marche.html",
                43.162048, 13.716844));

        // Ellis Pub
        attrList.add(new Attraction(
                "Ellis Pub",
                (float) 4.5,
                R.drawable.ellis,
                "Pub with a good selections on craft beers in a coosy environment. Go and visit it if you enjoy table board games or live rock music concerts.",
                "349/5847894",
                "http://www.musicclub.eu/locali/ellis-pub-fermo",
                43.162406, 13.717340));

        // Friends
        attrList.add(new Attraction(
                "Friends pub",
                (float) 4.3,
                R.drawable.friends,
                "Friends pub is happy to welcome you with a wide range of craft beers and fine wines. First pub ever in Fermo to offer american yummy food with a wide range of spirits from over the world. Kindly raccomended.",
                "333/2542163",
                "http://www.friendspub.it/",
                43.163370, 13.717460));

        return attrList;
    }

    /**
     *
     *
     * @return Where to sleep in Fermo
     */
    static ArrayList<Attraction> getSleepList(Context c) {
        ArrayList<Attraction> attrList = new ArrayList<>();

        // Hotel Astoria
        attrList.add(new Attraction(
                c.getString(
                        R.string.Hotel_1),
                (float) 4.6,
                R.drawable.astoria,
                c.getString(R.string.ph_desc),
                c.getString(R.string.ph_phone_num),
                c.getString(R.string.a_url),
                43.159993, 13.717364));

        // BB La Lanterna
        attrList.add(new Attraction(
                "B&B La Lanterna",
                (float) 4.7,
                R.drawable.lant,
                "Beautiful B&B located inside the heart of the old medieval Fermo Walls. You can choose a large variety of rooms sizes inside a stunning 900' years building restyled with all confort and amenities. Air conditioned and full breakfast service included.",
                "3388440527",
                "http://www.lalanternafermo.it/",
                43.163171, 13.719059));

        //  B&B 1912
        attrList.add(new Attraction(
                "B&B 1912",
                (float) 4.2,
                R.drawable.bb,
                "First B&B to ever establish in Fermo will pleased to accomade you inside beautiful rooms art deco style. The B&B offers in room service and swimming pool.",
                "0734623214",
                "http://www.bb1912.it/",
                43.158130, 13.706568));

        // Le Terrazze
        attrList.add(new Attraction(
                "Le Terrazze",
                (float) 3.9,
                R.drawable.terr,
                "This amazing B&B is located not that far from the city center in the heart of our beautiful country side. Enjoy delicious meals made by the owners Marcello and Teresa and relax in stunning rooms restyled with all the comforts.",
                "3334562169",
                "http://www.beb-fermo.com/",
                43.161706, 13.712295));



        return attrList;
    }
}
