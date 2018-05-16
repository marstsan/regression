import org.json.JSONException;

import com.mashape.unirest.http.exceptions.UnirestException;

public class test {
    public static void main(String[] args) throws JSONException, UnirestException {
        System.out.println(TokenAPI.BrandToken_API.getToken("GPIntegration",
                                                            "jKAAY6bIp6MD7G2ciwxAz36gQeTAdD4qgNAT3BbTpu1"));

        // TODO Auto-generated method stub
    }
}
