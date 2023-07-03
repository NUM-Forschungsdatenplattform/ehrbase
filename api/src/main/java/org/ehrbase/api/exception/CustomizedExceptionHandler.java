package org.ehrbase.api.exception;

import static java.util.Objects.nonNull;
import static org.ehrbase.api.exception.ExceptionsTemplate.errorMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

import org.ehrbase.api.exception.dto.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadGatewayException.class)
    public ResponseEntity<ErrorDetails> handleBadGatewayException(
            BadGatewayException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();

        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body( errorDetails );
    }

    @ExceptionHandler(GeneralRequestProcessingException.class)
    public ResponseEntity<ErrorDetails> handleGeneralRequestProcessingException(
            GeneralRequestProcessingException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();

        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body( errorDetails );
    }

    @ExceptionHandler(InternalServerException.class)
    public ResponseEntity<ErrorDetails> handleInternalServerException(
            InternalServerException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();

        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( errorDetails );
    }

    @ExceptionHandler(InvalidApiParameterException.class)
    public ResponseEntity<ErrorDetails> handleInvalidApiParameterException(
            InvalidApiParameterException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body( errorDetails );
    }

    @ExceptionHandler(NotAcceptableException.class)
    public ResponseEntity<ErrorDetails> handleNotAcceptableException(
            NotAcceptableException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body( errorDetails );
    }

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleObjectNotFoundException(
            ObjectNotFoundException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message("Type: [" + exception.getType() + "] " + (Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage()))
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body( errorDetails );
    }

    @ExceptionHandler(PreconditionFailedException.class)
    public ResponseEntity<ErrorDetails> handlePreconditionFailedException(
            PreconditionFailedException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body( errorDetails );
    }

    @ExceptionHandler(StateConflictException.class)
    public ResponseEntity<ErrorDetails> handleStateConflictException(
            StateConflictException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.CONFLICT).body( errorDetails );
    }

    @ExceptionHandler(UnexpectedSwitchCaseException.class)
    public ResponseEntity<ErrorDetails> handleUnexpectedSwitchCaseException(
            UnexpectedSwitchCaseException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body( errorDetails );
    }

    @ExceptionHandler(UnprocessableEntityException.class)
    public ResponseEntity<ErrorDetails> handleUnprocessableEntityException(
            UnprocessableEntityException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body( errorDetails );
    }

    @ExceptionHandler(UnsupportedMediaTypeException.class)
    public ResponseEntity<ErrorDetails> handleUnsupportedMediaTypeException(
            UnsupportedMediaTypeException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body( errorDetails );
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorDetails> handleValidationException(
            ValidationException exception) {

        var errors = Map.of( exception.getEntity().getSimpleName(),
                exception.getEntityId() );
        var className = nonNull(exception.getEntity()) ? exception.getEntity().getSimpleName() : null;
        var description = exception.getMessage();


        ErrorDetails errorDetails = ErrorDetails
                .builder()
                .messageId( nonNull(errorMap.get( exception.getEntityId())) ? errorMap.get( exception.getEntityId() ).getId() : -1)
                .argumentsList( nonNull(exception.getEntity()) ? Arrays.asList(className, description) : new ArrayList<>() )
                .message(Objects.isNull(exception.getCause()) ? exception.getMessage() : exception.getCause().getMessage() )
                .details( errors )
                .build();
        log.debug(exception.getMessage(), exception);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body( errorDetails );
    }



}
