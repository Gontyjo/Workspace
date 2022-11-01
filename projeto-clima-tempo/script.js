let loc = document.getElementById("loc")
let temp = document.getElementById("temp")
let img = document.getElementById("img")
let desc = document.getElementById("desc")

let backgroundBody= document.body

function backgroundWeather(description){
    console.log(description)
if(description=="clear sky"){
    backgroundBody.style.backgroundColor="rgb(245, 132, 31)"
} else if(description=="few clouds"){
    backgroundBody.style.backgroundColor="rgb(255, 219, 189)"
} else if(description=="scattered clouds"){
    backgroundBody.style.backgroundColor="rgb(176, 176, 176)"
} else if(description=="broken clouds"){
    backgroundBody.style.backgroundColor="rgb(52, 50, 50)"
} else if(description=="shower rain"){
    backgroundBody.style.backgroundColor="rgb(54, 76, 242)"
} else if(description=="rain"){
    backgroundBody.style.backgroundColor="rgb(26, 38, 132)"
} else if(description=="thunderstorm"){
    backgroundBody.style.backgroundColor="rgb(7, 14, 64)"
} else if(description=="snow"){
    backgroundBody.style.backgroundColor="rgb(202, 219, 242)"
} else if(description=="mist"){
    backgroundBody.style.backgroundColor="rgb(130, 130, 130)"
} else{
    backgroundBody.style.backgroundColor="rgb(130, 179, 192)"
}
}

function translateDescription(description) {
    var xhttp = new XMLHttpRequest();
    xhttp.open("GET", "https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=pt&dt=t&q=" + description, false);
    xhttp.send();
    var response = JSON.parse(xhttp.responseText);
    return response[0][0][0];
}

function capitalizeFirstLetter(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
  }
  
function showResults(data){
    loc.innerHTML=data.name
    console.log(translateDescription(data.weather[0].description))
    temp.innerHTML=Math.round(data.main.temp) + '&deg;'
    img.src = 'http://openweathermap.org/img/wn/'+data.weather[0].icon+'.png'
    backgroundWeather(data.weather[0].description)
    desc.innerHTML=capitalizeFirstLetter(translateDescription(data.weather[0].description))
    //http://openweathermap.org/img/wn/10d@2x.png
}

function getCoordintes() {
    var options = {
        enableHighAccuracy: true,
        timeout: 5000,
        maximumAge: 0
    };
  
    function success(pos) {
        var crd = pos.coords;
        var lat = crd.latitude.toString();
        var lng = crd.longitude.toString();
        var coordinates = [lat, lng];
        weather(lat,lng)
        console.log(`Latitude: ${lat}, Longitude: ${lng}`);
        return;
  
    }
  
    function error(err) {
        console.warn(`ERROR(${err.code}): ${err.message}`);
    }
  
    navigator.geolocation.getCurrentPosition(success, error, options);
}

function weather(lat,long) {
    var key = 'dc6e41b72040c67939eacf1df686f1e0';
    fetch('https://api.openweathermap.org/data/2.5/weather?lat='+lat+'&lon='+long+'&lang=en&units=metric&appid='+key)  
    .then(function(resp) { return resp.json() })
    .then(function(data) {
      console.log(data);
      showResults(data)
    })
    .catch(function() {
      // Erros
    });
  }
  
getCoordintes();
