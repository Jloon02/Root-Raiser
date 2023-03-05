 
let map: google.maps.Map;

function Map()  {
    function initMap(): void {
        map = new google.maps.Map(document.getElementById("map") as HTMLElement, {
          center: { lat: -34.397, lng: 150.644 },
          zoom: 8,
        });
      }
    return(
        <>
             <div id="map" onClick={()=>initMap()}>Map</div>
            <script
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC9UOdRpOXb5QbE8DMYgyLcrfJBkOGg9Rc&callback=initMap&v=weekly"
            defer
            ></script>
        </>
    )
}
 
export default Map