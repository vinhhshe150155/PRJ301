<section class="search-ticket-section padding-top pt-lg-0">
      <div class="container">
        <div
          class="search-tab bg_img"
          data-background="assets/images/ticket/ticket-bg01.jpg"
        >
          <div class="row align-items-center mb--20">
            <div class="col-lg-6 mb-20">
              <div class="search-ticket-header">
                <h6 class="category">welcome to Boleto</h6>
                <h3 class="title">what are you looking for</h3>
              </div>
            </div>
          </div>
          <div class="tab-area">
            <div class="tab-item active">
                <form autocomplete="off" class="ticket-search-form" method="get" action="films">
                <div class="form-group large">
                    <input id="searchFilm" name="name" autocomplete="off" type="text" placeholder="Search for Movies" value="${requestScope.name}"/>
                    <button type="submit"><i class="fas fa-search"></i></button>                 
                       <div id="searchList" style="position: absolute; width: 100%; background-color: white; color: black;z-index:1; top: 100%; border-radius: 4px; overflow: hidden">
                       </div>
                </div>               
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>   