package fm.ps.annat.travel.employees.model

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 3/9/2022
 * @InTheHour : 22 : 52 : 07
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class Notification(private var id : Int, private var title : String, private var description: String ,  private var date: String) {

    fun getId() : Int{
        return id
    }

    fun getTitle() : String{
        return title
    }

    fun getDescription() : String{
        return description
    }

    fun getDate() : String{
        return date
    }

}