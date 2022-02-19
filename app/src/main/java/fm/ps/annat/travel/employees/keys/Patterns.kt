package fm.ps.annat.travel.employees.keys

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 01 : 01 : 10
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object Patterns {

    const val PATTERN_EMAIL = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" + "\\@" + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +"(" +"\\." +"[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" + ")+"
    //const val PATTERN_NAME = "^" + "(?=.*[A-Za-z])" + "(?=\\S+$)" + ".{5,20}" + "$"
    const val PATTERN_NAME = "^" + "(?=\\S+$)" + ".{5,20}" + "$"
    const val PATTERN_PASSWORD = "^" + "(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*[a-zA-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{8,20}" + "$"
}