package fm.ps.annat.travel.employees.model

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/10/2022
 * @InTheHour : 12 : 20 : 18
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class Pilgrism(private var id : Int, private var name : String, private var passport: String ) {

    fun getId() : Int{
        return id
    }

    fun getName() : String{
        return name
    }

    fun getPassport() : String{
        return passport
    }

}