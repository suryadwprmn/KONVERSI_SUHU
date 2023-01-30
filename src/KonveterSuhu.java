public class KonveterSuhu {
    public void setSuhuMulamula(float suhuMulamula) {
        this.suhuMulamula = suhuMulamula;
    }

    public float getSuhuMulamula() {
        return suhuMulamula;
    }

    private float suhuMulamula;

    public float getCelciustoReamur() {
        CelciustoReamur = 0.8F * suhuMulamula;
        return CelciustoReamur;
    }

    public float getCelciusToFahrenheit() {
        CelciusToFahrenheit = (1.8F * suhuMulamula) + 32;
        return CelciusToFahrenheit;
    }

    public float getCelciustoKelvin() {
        CelciustoKelvin = suhuMulamula + 273;
        return CelciustoKelvin;
    }

    public float getFahrenheitToCelcius() {
        FahrenheitToCelcius = 0.55f * (suhuMulamula-32);
        return FahrenheitToCelcius;
    }

    public float getFahrenheitToReamur() {
        FahrenheitToReamur = 0.44f *(suhuMulamula-32);
        return FahrenheitToReamur;
    }

    public float getFahrenheittoKelvin() {
        FahrenheittoKelvin = 0.55f *(suhuMulamula-32) + 273;
        return FahrenheittoKelvin;
    }

    public float getReamurtoCelcius() {
        ReamurtoCelcius = 1.25f*suhuMulamula;
        return ReamurtoCelcius;
    }

    public float getReamurtoFahrenheit() {
        ReamurtoFahrenheit = (2.25f*suhuMulamula) +32;
        return ReamurtoFahrenheit;
    }

    public float getReamurtoKelvin() {
        ReamurtoKelvin = 1.25f *suhuMulamula + 273;
        return ReamurtoKelvin;
    }



    private float CelciustoReamur,CelciusToFahrenheit,CelciustoKelvin;
    private float FahrenheitToCelcius,FahrenheitToReamur,FahrenheittoKelvin;

    private float ReamurtoCelcius,ReamurtoFahrenheit,ReamurtoKelvin;

    public double getKelvitoCelcius() {
        KelvitoCelcius = suhuMulamula - 273;
        return KelvitoCelcius;
    }

    public double getKelvintoReamur() {
        KelvintoReamur = 0.8f * (suhuMulamula-273);
        return KelvintoReamur;
    }

    public double getKelvintoFahrenheit() {
        KelvintoFahrenheit = (1.8f*(suhuMulamula-273)) + 32;
        return KelvintoFahrenheit;
    }

    private double KelvitoCelcius,KelvintoReamur,KelvintoFahrenheit;

}

