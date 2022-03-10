package fm.ps.annat.travel.employees.model

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/9/2022
 * @InTheHour : 23 : 13 : 07
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class ContactUs(private var id : Int, private var message : String, private var date: String ,  private var type: Int) {

    fun getId() : Int{
        return id
    }

    fun getMessage() : String{
        return message
    }

    fun getDate() : String{
        return date
    }

    fun getType() : Int{
        return type
    }

}