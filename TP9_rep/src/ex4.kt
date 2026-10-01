class Configuration{
    fun simulation(){
        println("configuration is running...")
    }
}
class App{
    val config by lazy {
        println("configuration loading")
        Configuration()
    }
}

fun main(){
    var app = App()
    app.config.simulation()
}
//chno drna fhad tp
//gadi class configuration odrna fiha wahed function gha bach ndiro simulation dyl configuration
//mn wraha drna class app odrna variable config zdna lih propritie lazy 3lch??
//zdna propritie lazy bach manst3mloch dak variable hta nhtoj
//bma3na vach ndiro objet dyl class app maytgadch lina dak variable config hta n3iyto lih hna
//kfima f solution
//"app.config.simulation()" had star chno tra hna
//chdina dak objet app o3iytna 3la config dylo fach 3iytna 3la dak variable chno tra
//dik sa3a dak variable wlat l9ima dylo hiya class configuration
// bma3na wlat config objet dyl class Configuration
//odak objet 3ndo acces ldik function simulation
//osf 3tana resultat li ghatchouf f terminale