package org.xdi.oxd.rp.client;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Yuriy Zabrovarnyy
 * @version 0.9, 19/10/2015
 */

public class RpClientUtilsTest {

    @Test
    public void test() {
        String href = "https://ox.gluu.org/oxdRpDemo#session_id=bcc678bf-5229-4794-85e0-9014ea514e9f&scope=openid+profile&state=af0ifjsldkj&expires_in=3599" +
                "&token_type=bearer" +
                "&code=14f14361-4c37-4b03-a1ba-6e49f24a2a59" +
                "&id_token=eyJ0eXAiOiJKV1MiLCJhbGciOiJSUzI1NiIsImtpZCI6ImMwNzAzNjk5LWIxMTgtNDlhNS04YTM0LWVhYjM1MWFkZjg5ZCJ9.eyJpc3MiOiJodHRwczovL2NlLWRldi5nbHV1Lm9yZyIsImF1ZCI6IkAhMDAzNS45MzRGLjFBNTEuNzdCMCEwMDAxITQwMkQuNjZEMCEwMDA4IUU4QUMuMEM3OSIsImV4cCI6MTQ0NTI3NTIyNCwiaWF0IjoxNDQ1MjcxNjI0LCJub25jZSI6Im4tMFM2X1d6QTJNaiIsImF1dGhfdGltZSI6MTQ0NTI3MTYwMywiY19oYXNoIjoiTGRCbDRVbHMwRTJTLXY5UFFiQW9mUSIsImF0X2hhc2giOiJmdG1qYVZHSkVaYjVKb0UtZ2pwOV9RIiwib3hWYWxpZGF0aW9uVVJJIjoiaHR0cHM6Ly9jZS1kZXYuZ2x1dS5vcmcvb3hhdXRoL29waWZyYW1lIiwib3hPcGVuSURDb25uZWN0VmVyc2lvbiI6Im9wZW5pZGNvbm5lY3QtMS4wIiwiaW51bSI6IkAhMDAzNS45MzRGLjFBNTEuNzdCMCEwMDAxITQwMkQuNjZEMCEwMDAwIUIxRjMuQUVBRS5CNzk4IiwibmFtZSI6Im94QXV0aCBUZXN0IFVzZXIiLCJmYW1pbHlfbmFtZSI6IlVzZXIiLCJnaXZlbl9uYW1lIjoiVGVzdCIsIm1pZGRsZV9uYW1lIjoiVXNlciIsIm5pY2tuYW1lIjoidXNlciIsInByZWZlcnJlZF91c2VybmFtZSI6InVzZXIiLCJwcm9maWxlIjoiaHR0cDovL3d3dy5teXdlYnNpdGUuY29tL3Byb2ZpbGUiLCJwaWN0dXJlIjoiaHR0cDovL3d3dy5nbHV1Lm9yZy93cC1jb250ZW50L3VwbG9hZHMvMjAxMi8wNC9taWtlMy5wbmciLCJ3ZWJzaXRlIjoiaHR0cDovL3d3dy5nbHV1Lm9yZyIsImdlbmRlciI6Ik1hbGUiLCJiaXJ0aGRhdGUiOiIxOTgzLTEtNiIsInpvbmVpbmZvIjoiQW1lcmljYS9DaGljYWdvIiwibG9jYWxlIjoiZW4tVVMiLCJ1cGRhdGVkX2F0IjoiMTQyODAwNDE2MyIsInN1YiI6IkAhMDAzNS45MzRGLjFBNTEuNzdCMCEwMDAxITQwMkQuNjZEMCEwMDAwIUIxRjMuQUVBRS5CNzk4In0.KRV7Bl6yDB8Nkq1ne0RVWEzQqSfF4ZvIhZrJK5ozEOHrbJ-DnCkogZ6Lg7DvNRQjgzta8k5yAv7IMbfarvoJhakk-hopLP4tpLDNrLWnpSFj17FhWfy8pAKrw4vlzxZREHduPDsQjVL6i8MAx8WhGgjMlzvBGdHCluPidP-DQxuxE0N6-S5KQssQ0ofKVI4I4nNx_mcFyCU5mtReMEi4Sl7nO86eJe-m11kcOWY5BgqAPHFvqJWwY4ZBJGzU_VlkdunU_6S5A52Z0JEqtpj56qE1Vz7nvvzCvH0PTqh0oMrBmwgJlyfY4KBLr5xsvkpT5g5xaI3g0MALNCqNKPl81g" +
                "&access_token=e3f5c4fa-b3e0-4c94-912b-5b5b2ac27bb2\n";

        final HrefDetails details = RpClientUtils.parseHref(href);

        assertEquals(details.getAccessToken(), "e3f5c4fa-b3e0-4c94-912b-5b5b2ac27bb2");
        assertEquals(details.getCode(), "14f14361-4c37-4b03-a1ba-6e49f24a2a59");
        assertEquals(details.getIdToken(), "eyJ0eXAiOiJKV1MiLCJhbGciOiJSUzI1NiIsImtpZCI6ImMwNzAzNjk5LWIxMTgtNDlhNS04YTM0LWVhYjM1MWFkZjg5ZCJ9.eyJpc3MiOiJodHRwczovL2NlLWRldi5nbHV1Lm9yZyIsImF1ZCI6IkAhMDAzNS45MzRGLjFBNTEuNzdCMCEwMDAxITQwMkQuNjZEMCEwMDA4IUU4QUMuMEM3OSIsImV4cCI6MTQ0NTI3NTIyNCwiaWF0IjoxNDQ1MjcxNjI0LCJub25jZSI6Im4tMFM2X1d6QTJNaiIsImF1dGhfdGltZSI6MTQ0NTI3MTYwMywiY19oYXNoIjoiTGRCbDRVbHMwRTJTLXY5UFFiQW9mUSIsImF0X2hhc2giOiJmdG1qYVZHSkVaYjVKb0UtZ2pwOV9RIiwib3hWYWxpZGF0aW9uVVJJIjoiaHR0cHM6Ly9jZS1kZXYuZ2x1dS5vcmcvb3hhdXRoL29waWZyYW1lIiwib3hPcGVuSURDb25uZWN0VmVyc2lvbiI6Im9wZW5pZGNvbm5lY3QtMS4wIiwiaW51bSI6IkAhMDAzNS45MzRGLjFBNTEuNzdCMCEwMDAxITQwMkQuNjZEMCEwMDAwIUIxRjMuQUVBRS5CNzk4IiwibmFtZSI6Im94QXV0aCBUZXN0IFVzZXIiLCJmYW1pbHlfbmFtZSI6IlVzZXIiLCJnaXZlbl9uYW1lIjoiVGVzdCIsIm1pZGRsZV9uYW1lIjoiVXNlciIsIm5pY2tuYW1lIjoidXNlciIsInByZWZlcnJlZF91c2VybmFtZSI6InVzZXIiLCJwcm9maWxlIjoiaHR0cDovL3d3dy5teXdlYnNpdGUuY29tL3Byb2ZpbGUiLCJwaWN0dXJlIjoiaHR0cDovL3d3dy5nbHV1Lm9yZy93cC1jb250ZW50L3VwbG9hZHMvMjAxMi8wNC9taWtlMy5wbmciLCJ3ZWJzaXRlIjoiaHR0cDovL3d3dy5nbHV1Lm9yZyIsImdlbmRlciI6Ik1hbGUiLCJiaXJ0aGRhdGUiOiIxOTgzLTEtNiIsInpvbmVpbmZvIjoiQW1lcmljYS9DaGljYWdvIiwibG9jYWxlIjoiZW4tVVMiLCJ1cGRhdGVkX2F0IjoiMTQyODAwNDE2MyIsInN1YiI6IkAhMDAzNS45MzRGLjFBNTEuNzdCMCEwMDAxITQwMkQuNjZEMCEwMDAwIUIxRjMuQUVBRS5CNzk4In0.KRV7Bl6yDB8Nkq1ne0RVWEzQqSfF4ZvIhZrJK5ozEOHrbJ-DnCkogZ6Lg7DvNRQjgzta8k5yAv7IMbfarvoJhakk-hopLP4tpLDNrLWnpSFj17FhWfy8pAKrw4vlzxZREHduPDsQjVL6i8MAx8WhGgjMlzvBGdHCluPidP-DQxuxE0N6-S5KQssQ0ofKVI4I4nNx_mcFyCU5mtReMEi4Sl7nO86eJe-m11kcOWY5BgqAPHFvqJWwY4ZBJGzU_VlkdunU_6S5A52Z0JEqtpj56qE1Vz7nvvzCvH0PTqh0oMrBmwgJlyfY4KBLr5xsvkpT5g5xaI3g0MALNCqNKPl81g");
    }
}
