public class Codec {
    int id = 0;
    HashMap<String,String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        String url = String.valueOf(id);
        map.put(url,longUrl);
        return "http://sanjayn.me/"+url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.substring(shortUrl.lastIndexOf("/")+1);
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));