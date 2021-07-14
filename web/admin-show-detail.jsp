<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>AdminLTE 3 | General Form Elements</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="assets/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
  <!-- Navbar -->
  
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <jsp:include page="admin-header.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Show</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Show</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <!-- left column -->
          <div class="col-md-6">
            <!-- general form elements -->
            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">Details</h3>
              </div>
              <!-- /.card-header -->
              <c:set var="s" value="${requestScope.show}"></c:set>
              <c:set var="t" value="${requestScope.ticket}"></c:set>
              <c:set var="f" value="${requestScope.film}"></c:set>
                <div class="card-body">
                   <div class="form-group">
                    <label for="id">ID</label>
                    <input value="${s.id}" readonly name="id" type="text" class="form-control" id="id" placeholder="ID">
                  </div>
                  <div class="form-group">
                    <label for="name">Film</label>
                    <input value="${f.name}" name="name" type="text" name="name" class="form-control" id="name" placeholder="Name" readonly>
                  </div>
                  <div class="form-group">
                    <label for="name">Room</label>
                    <input value="${s.room_id}" name="time" type="text" class="form-control" id="room" placeholder="Name" readonly>
                  </div>
                  <div class="form-group">
                    <label for="name">Time</label>
                    <input value="${s.time}" name="time" type="text" class="form-control" id="room" placeholder="Name" readonly>
                  </div>
                  <div class="form-group">
                    <label for="name">Ticket left</label>
                    <input value="${t.size()}" name="room" type="text" class="form-control" id="room" placeholder="Name" readonly>
                  </div>
                  
                  <div class="form-group">
                    <label for="name">Name Ticket Left</label>
                    <p>${requestScope.tk}</p>
                    <!--<input value="" name="time" type="text" class="form-control" id="room" placeholder="Name">-->
                  </div>
                  
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                    <a href="admin-showControl?type=0"><button class="btn btn-primary">Back</button></a>
                </div>
            </div>


          </div>

          </div>
          <!--/.col (right) -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <jsp:include page="admin-footer.jsp"/>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="assets/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- bs-custom-file-input -->
<script src="assets/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
<!-- AdminLTE App -->
<script src="assets/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="assets/dist/js/demo.js"></script>
<!-- Page specific script -->
<script>
$(function () {
  bsCustomFileInput.init();
});
</script>
</body>
</html>
