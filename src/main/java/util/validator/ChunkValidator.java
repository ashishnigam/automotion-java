package util.validator;

import net.itarray.automotion.validation.ChunkUIElementValidator;
import org.openqa.selenium.WebElement;

/**
 * @deprecated As of release 2.0, replaced by {@link net.itarray.automotion.validation.ChunkUIElementValidator}
 */
@Deprecated
public interface ChunkValidator extends ChunkUIElementValidator {

    ResponsiveUIChunkValidator changeMetricsUnitsTo(ResponsiveUIValidator.Units units);

    ResponsiveUIChunkValidator changeMetricsUnitsTo(net.itarray.automotion.validation.Units units);

    ResponsiveUIChunkValidator alignedAsGrid(int horizontalGridSize);

    ResponsiveUIChunkValidator alignedAsGrid(int horizontalGridSize, int verticalGridSize);

    ResponsiveUIChunkValidator areNotOverlappedWithEachOther();

    ResponsiveUIChunkValidator withSameSize();

    ResponsiveUIChunkValidator withSameWidth();

    ResponsiveUIChunkValidator withSameHeight();

    ResponsiveUIChunkValidator withNotSameSize();

    ResponsiveUIChunkValidator withNotSameWidth();

    ResponsiveUIChunkValidator withNotSameHeight();

    ResponsiveUIChunkValidator sameRightOffset();

    ResponsiveUIChunkValidator sameLeftOffset();

    ResponsiveUIChunkValidator sameTopOffset();

    ResponsiveUIChunkValidator sameBottomOffset();

    ResponsiveUIChunkValidator equalLeftRightOffset();

    ResponsiveUIChunkValidator equalTopBottomOffset();

    ResponsiveUIChunkValidator insideOf(WebElement containerElement, String readableContainerName);

}
