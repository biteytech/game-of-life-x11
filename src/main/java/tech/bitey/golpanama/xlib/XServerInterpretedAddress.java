// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     int typelength;
 *     int valuelength;
 *     char *type;
 *     char *value;
 * }
 * }
 */
public class XServerInterpretedAddress {

    XServerInterpretedAddress() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Xlib_h.C_INT.withName("typelength"),
        Xlib_h.C_INT.withName("valuelength"),
        Xlib_h.C_POINTER.withName("type"),
        Xlib_h.C_POINTER.withName("value")
    ).withName("$anon$350:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt typelength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("typelength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int typelength
     * }
     */
    public static final OfInt typelength$layout() {
        return typelength$LAYOUT;
    }

    private static final long typelength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int typelength
     * }
     */
    public static final long typelength$offset() {
        return typelength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int typelength
     * }
     */
    public static int typelength(MemorySegment struct) {
        return struct.get(typelength$LAYOUT, typelength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int typelength
     * }
     */
    public static void typelength(MemorySegment struct, int fieldValue) {
        struct.set(typelength$LAYOUT, typelength$OFFSET, fieldValue);
    }

    private static final OfInt valuelength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("valuelength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int valuelength
     * }
     */
    public static final OfInt valuelength$layout() {
        return valuelength$LAYOUT;
    }

    private static final long valuelength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int valuelength
     * }
     */
    public static final long valuelength$offset() {
        return valuelength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int valuelength
     * }
     */
    public static int valuelength(MemorySegment struct) {
        return struct.get(valuelength$LAYOUT, valuelength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int valuelength
     * }
     */
    public static void valuelength(MemorySegment struct, int fieldValue) {
        struct.set(valuelength$LAYOUT, valuelength$OFFSET, fieldValue);
    }

    private static final AddressLayout type$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *type
     * }
     */
    public static final AddressLayout type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *type
     * }
     */
    public static MemorySegment type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *type
     * }
     */
    public static void type(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final AddressLayout value$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static final AddressLayout value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static MemorySegment value(MemorySegment struct) {
        return struct.get(value$LAYOUT, value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *value
     * }
     */
    public static void value(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value$LAYOUT, value$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

